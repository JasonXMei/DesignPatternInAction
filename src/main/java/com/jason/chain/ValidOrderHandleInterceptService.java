package com.jason.chain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
@Slf4j
public class ValidOrderHandleInterceptService implements OrderHandleIntercept {

    @Override
    public void handle(OrderContext orderContext) {
        log.info("check request param: {}", orderContext);
    }
    
}
