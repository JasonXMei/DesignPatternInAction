package com.jason.state;

import lombok.extern.slf4j.Slf4j;

/**
 * 预返奖
 */
@Slf4j
public class PreRewardState extends RewardState {

    @Override
    public void doReward(RewardContext context, RewardRequest request) {
        if (request.getUserId().equals(1L)
                || request.getUserId().equals(2L)) {
            log.info("用户未退款，进入待返奖状态");
            context.setRewardState(new PendingRewardState());
        } else {
            log.info("用户退款，进入失败状态");
            context.setRewardState(new FailState());
        }

        context.execute();
    }

}
