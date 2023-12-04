package com.jason.chain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderHandleChain {

    @Autowired
    private List<OrderHandleIntercept> orderHandleIntercepts;

    public void execute(OrderContext orderContext) {
        orderHandleIntercepts.stream().forEach(orderHandleIntercept -> {
            orderHandleIntercept.handle(orderContext);
        });
    }

}
