package com.sandbox.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class DataResponsePay implements Serializable {

    private static final long serialVersionUID = 1L;

    public String id;

    @JsonProperty("created_at")
    public Date createdAt;

    @JsonProperty("finalized_at")
    public Date finalizedAt;

    @JsonProperty("amount_in_cents")
    public int amountInCents;
    public String reference;
    public String customer_email;
    public String currency;

    @JsonProperty("payment_method_type")
    public String paymentMethodType;

    @JsonProperty("payment_method")
    public PaymentMethod paymentMethod;
    public String status;

    @JsonProperty("status_message")
    public String statusMessage;

    @JsonProperty("billing_data")
    public String billingData;

    @JsonProperty("shipping_address")
    public String shippingAddress;

    @JsonProperty("redirect_url")
    public String redirectUrl;

    @JsonProperty("payment_source_id")
    public Integer paymentSourceId;

    @JsonProperty("payment_link_id")
    public String paymentLinkId;

    @JsonProperty("customer_data")
    public String customerData;

    @JsonProperty("bill_id")
    public String billId;
    public ArrayList<Object> taxes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getFinalizedAt() {
        return finalizedAt;
    }

    public void setFinalizedAt(Date finalizedAt) {
        this.finalizedAt = finalizedAt;
    }

    public int getAmountInCents() {
        return amountInCents;
    }

    public void setAmountInCents(int amountInCents) {
        this.amountInCents = amountInCents;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPaymentMethodType() {
        return paymentMethodType;
    }

    public void setPaymentMethodType(String paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getBillingData() {
        return billingData;
    }

    public void setBillingData(String billingData) {
        this.billingData = billingData;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public Integer getPaymentSourceId() {
        return paymentSourceId;
    }

    public void setPaymentSourceId(Integer paymentSourceId) {
        this.paymentSourceId = paymentSourceId;
    }

    public String getPaymentLinkId() {
        return paymentLinkId;
    }

    public void setPaymentLinkId(String paymentLinkId) {
        this.paymentLinkId = paymentLinkId;
    }

    public String getCustomerData() {
        return customerData;
    }

    public void setCustomerData(String customerData) {
        this.customerData = customerData;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public ArrayList<Object> getTaxes() {
        return taxes;
    }

    public void setTaxes(ArrayList<Object> taxes) {
        this.taxes = taxes;
    }
}
