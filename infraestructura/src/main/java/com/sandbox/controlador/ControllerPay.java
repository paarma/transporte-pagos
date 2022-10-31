package com.sandbox.controlador;

import com.sandbox.casouso.PayCaseUse;
import com.sandbox.entidades.PayData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/v1/pagos")
public class ControllerPay {

    PayCaseUse payCaseUse;

    public ControllerPay(PayCaseUse payCaseUse) {
        this.payCaseUse = payCaseUse;
    }

    @PostMapping
    public ResponseEntity<PayData> createPay(@RequestBody PayData payData){
        return new ResponseEntity<>(payCaseUse.createPay(payData), HttpStatus.CREATED);
    }

}
