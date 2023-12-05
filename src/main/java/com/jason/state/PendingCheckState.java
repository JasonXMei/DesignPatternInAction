package com.jason.state;

import lombok.extern.slf4j.Slf4j;

/**
 * 待校验
 */
@Slf4j
public class PendingCheckState extends RewardState {

    @Override
    public void doReward(RewardContext context, RewardRequest request) {
        if (request.getOrderId().equals(1L)) {
            log.info("校验通过，用户进入预返奖状态");
            context.setRewardState(new PreRewardState());
        } else {
            log.info("校验未通过，用户进入失败状态");
            context.setRewardState(new FailState());
        }

        context.execute();
    }

}
