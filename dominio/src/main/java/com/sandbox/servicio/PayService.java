package com.sandbox.servicio;

import com.sandbox.entidades.PayData;
import com.sandbox.repositorio.PayRepository;

import javax.inject.Named;

@Named
public class PayService {

    private PayRepository payRepository;

    public PayService(PayRepository payRepository) {
        this.payRepository = payRepository;
    }

    public PayData createPay(PayData payData) {
        return this.payRepository.createPay(payData);
    }
}
