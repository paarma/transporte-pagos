package com.sandbox.dto;

public class PaymentMethod {
    public String type;
    public Extra extra;
    public Integer installments;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Extra getExtra() {
        return extra;
    }

    public void setExtra(Extra extra) {
        this.extra = extra;
    }

    public Integer getInstallments() {
        return installments;
    }

    public void setInstallments(Integer installments) {
        this.installments = installments;
    }
}
