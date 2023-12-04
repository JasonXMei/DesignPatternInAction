package com.jason.strategy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class WechatPaymentPlugin implements PaymentPlugin {

    @Override
    public boolean isSupport(String paymentType) {
        return PaymentType.WECHAT_PAY.getCode().equalsIgnoreCase(paymentType);
    }

    @Override
    public void payment() {
        log.info("wechat payment");
    }

}
