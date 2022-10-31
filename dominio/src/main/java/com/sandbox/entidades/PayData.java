package com.sandbox.entidades;

import java.io.Serializable;

public class PayData {

    private Long amountInCents;
    private String currency;
    private String customerEmail;
    private PaymentMethod paymentMethod;
    private Long reference;
    private Long paymentSourceId;


    public Long getAmountInCents() {
        return amountInCents;
    }

    public void setAmountInCents(Long amountInCents) {
        this.amountInCents = amountInCents;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Long getReference() {
        return reference;
    }

    public void setReference(Long reference) {
        this.reference = reference;
    }

    public Long getPaymentSourceId() {
        return paymentSourceId;
    }

    public void setPaymentSourceId(Long paymentSourceId) {
        this.paymentSourceId = paymentSourceId;
    }
}
