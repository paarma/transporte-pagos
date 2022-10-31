package com.sandbox.casouso;

import com.sandbox.entidades.PayData;
import com.sandbox.servicio.PayService;

import javax.inject.Named;

@Named
public class PayCaseUse {

    private PayService payService;

    public PayCaseUse(PayService payService) {
        this.payService = payService;
    }

    public PayData createPay(PayData payData) {
        return this.payService.createPay(payData);
    }
}
