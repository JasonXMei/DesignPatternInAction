package com.jason;

import com.jason.strategy.PaymentPluginHandler;
import com.jason.strategy.PaymentType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StrategyTest {

    @Autowired
    private PaymentPluginHandler paymentPluginHandler;

    @Test
    public void testAlipay() {
        paymentPluginHandler.doPayment(PaymentType.ALI_PAY.getCode());
    }

    @Test
    public void testWechatpay() {
        paymentPluginHandler.doPayment(PaymentType.WECHAT_PAY.getCode());
    }

    @Test
    public void testNoSupportPay() {
        paymentPluginHandler.doPayment(PaymentType.PAYPAL_PAY.getCode());
    }

}
