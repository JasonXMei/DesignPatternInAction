package com.jason.strategy;

public interface PaymentPlugin {

    boolean isSupport(String paymentType);

    void payment();

}
