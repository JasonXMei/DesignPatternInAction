package com.jason.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class OrderCreateFlow {

    public void createOrder() {
        validateParam();

        create();

        if (needNotify()) {
            sendNotify();
        }
    }

    private void create() {
        log.info("order created");
    }

    private void validateParam() {
        log.info("param validated");
    }

    protected boolean needNotify() {
        return false;
    }

    abstract void sendNotify();

}
