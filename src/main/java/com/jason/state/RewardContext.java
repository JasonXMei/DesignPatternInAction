package com.jason.state;

import lombok.Data;

@Data
public class RewardContext {

    private RewardState rewardState;

    private RewardRequest request;

    public void execute() {
        rewardState.doReward(this, request);
    }

}
