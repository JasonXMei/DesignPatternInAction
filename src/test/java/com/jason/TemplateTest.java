package com.jason;

import com.jason.template.OrderCreateFlow;
import com.jason.template.OrderCreateWithEmailNotify;
import com.jason.template.OrderCreateWithSMSNotify;
import org.junit.jupiter.api.Test;

public class TemplateTest {

    @Test
    public void testOrderCreateWithEmailNotify() {
        OrderCreateFlow orderCreateFlow = new OrderCreateWithEmailNotify();
        orderCreateFlow.createOrder();
    }

    @Test
    public void testOrderCreateWithSMSNotify() {
        OrderCreateFlow orderCreateFlow = new OrderCreateWithSMSNotify();
        orderCreateFlow.createOrder();
    }

}
