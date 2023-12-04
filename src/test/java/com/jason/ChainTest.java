package com.jason;

import com.jason.chain.OrderContext;
import com.jason.chain.OrderHandleChain;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ChainTest {

    @Autowired
    private OrderHandleChain orderHandleChain;

    @Test
    public void testOrderCreate() {
        OrderContext orderContext = OrderContext.builder()
                .seqId("001")
                .userId("xg001")
                .skuId("sn0001")
                .build();

        orderHandleChain.execute(orderContext);
    }
}
