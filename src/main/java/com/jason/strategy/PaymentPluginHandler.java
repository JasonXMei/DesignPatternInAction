package com.jason.strategy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
@Slf4j
public class PaymentPluginHandler {

    @Autowired
    private List<PaymentPlugin> paymentPluginList;

    public void doPayment(String paymentType) {
        PaymentPlugin paymentPlugin = getPaymentPlugin(paymentType);

        if (Objects.isNull(paymentPlugin)) {
            log.warn("not support this payment: {}", paymentType);
            return;
        }

        paymentPlugin.payment();
    }

    private PaymentPlugin getPaymentPlugin(String paymentType) {
        return paymentPluginList.stream()
                .filter(paymentPlugin -> paymentPlugin.isSupport(paymentType))
                .findFirst()
                .orElse(null);
    }

}
