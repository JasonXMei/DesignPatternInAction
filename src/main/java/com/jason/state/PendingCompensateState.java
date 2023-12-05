package com.jason.state;

import lombok.extern.slf4j.Slf4j;

/**
 * 待补偿
 */
@Slf4j
public class PendingCompensateState extends RewardState {

    @Override
    public void doReward(RewardContext context, RewardRequest request) {
        log.info("定时任务触发补偿机制，直至返奖成功，进入完成状态");
        context.setRewardState(new FinishState());

        context.execute();
    }

}
