package com.jason.state;

import lombok.extern.slf4j.Slf4j;

/**
 * 待返奖
 */
@Slf4j
public class PendingRewardState extends RewardState {

    @Override
    public void doReward(RewardContext context, RewardRequest request) {
        if (request.getUserId().equals(1L)) {
            log.info("返奖成功，进入完成状态");
            context.setRewardState(new FinishState());
        } else {
            log.info("返奖不成功，进入待补偿状态");
            context.setRewardState(new PendingCompensateState());
        }

        context.execute();
    }

}
