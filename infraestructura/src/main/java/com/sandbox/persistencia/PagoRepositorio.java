package com.sandbox.persistencia;

import com.sandbox.dto.DataResponsePay;
import com.sandbox.entidades.PayData;
import com.sandbox.repositorio.PayRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Repository
public class PagoRepositorio implements PayRepository {

    private static final String PATH_API_WOMPI = "https://sandbox.wompi.co/v1/";
    public static final String ERROR_CREATING_PAYMENT = "Error creating payment";
    private WebClient webClient;

    @Value("${key.pub}")
    private String keyPublic;


    public PagoRepositorio(WebClient webClient) {
        this.webClient = webClient;
    }

    @Override
    public PayData createPay(PayData payData) {

        StringBuilder pathApiDataSourcePay = new StringBuilder();
        pathApiDataSourcePay.append(PATH_API_WOMPI)
                .append("transactions");

        DataResponsePay payDataResponse = this.webClient.post()
                .uri(pathApiDataSourcePay.toString())
                .headers(h -> {
                            h.setBearerAuth(keyPublic);
                            h.setContentType(MediaType.APPLICATION_JSON);
                        }
                )
                .body(Mono.just(payData), PayData.class)
                .retrieve()
                .onStatus(HttpStatus::is4xxClientError, response ->
                        Mono.error(new RuntimeException(ERROR_CREATING_PAYMENT)))
                .onStatus(HttpStatus::is5xxServerError, response ->
                        Mono.error(new RuntimeException(ERROR_CREATING_PAYMENT)))
                .bodyToMono(DataResponsePay.class)
                .block();

        return payData;
    }
}
