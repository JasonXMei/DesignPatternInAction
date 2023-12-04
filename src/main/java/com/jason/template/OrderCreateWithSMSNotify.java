package com.jason.template;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class OrderCreateWithSMSNotify extends OrderCreateFlow{

    @Override
    public boolean needNotify() {
        return true;
    }

    @Override
    void sendNotify() {
        log.info("send sms message to customer");
    }

}
