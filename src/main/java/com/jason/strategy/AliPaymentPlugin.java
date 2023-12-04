package com.jason.strategy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AliPaymentPlugin implements PaymentPlugin {

    @Override
    public boolean isSupport(String paymentType) {
        return PaymentType.ALI_PAY.getCode().equalsIgnoreCase(paymentType);
    }

    @Override
    public void payment() {
        log.info("ali payment");
    }

}
