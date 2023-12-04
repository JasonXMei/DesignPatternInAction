package com.jason.chain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderContext {

    private String seqId;

    private String skuId;

    private String userId;

}
