package com.jason.strategy;

public enum PaymentType {

    WECHAT_PAY("wechat_pay"), ALI_PAY("ali_pay"), PAYPAL_PAY("paypal_pay");

    private String code;

    PaymentType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
