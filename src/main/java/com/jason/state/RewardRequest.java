package com.jason.state;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RewardRequest {

    private Long userId;

    private Long orderId;

}
