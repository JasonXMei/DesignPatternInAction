package com.jason;

import com.jason.state.PendingCheckState;
import com.jason.state.RewardContext;
import com.jason.state.RewardRequest;
import org.junit.jupiter.api.Test;

public class StateTest {

    @Test
    public void normalTest() {
        RewardContext context = new RewardContext();
        context.setRewardState(new PendingCheckState());

        RewardRequest request = RewardRequest.builder()
                .orderId(1L)
                .userId(1L)
                .build();
        context.setRequest(request);

        context.execute();
    }

    @Test
    public void notPassCheckTest() {
        RewardContext context = new RewardContext();
        context.setRewardState(new PendingCheckState());

        RewardRequest request = RewardRequest.builder()
                .orderId(2L)
                .userId(1L)
                .build();
        context.setRequest(request);

        context.execute();
    }

    @Test
    public void notPassRefundCheckTest() {
        RewardContext context = new RewardContext();
        context.setRewardState(new PendingCheckState());

        RewardRequest request = RewardRequest.builder()
                .orderId(1L)
                .userId(3L)
                .build();
        context.setRequest(request);

        context.execute();
    }

    @Test
    public void enterPendingCompensateTest() {
        RewardContext context = new RewardContext();
        context.setRewardState(new PendingCheckState());

        RewardRequest request = RewardRequest.builder()
                .orderId(1L)
                .userId(2L)
                .build();
        context.setRequest(request);

        context.execute();
    }

}
