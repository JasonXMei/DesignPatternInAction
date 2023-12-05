package com.jason.state;

import lombok.extern.slf4j.Slf4j;

/**
 * 完成
 */
@Slf4j
public class FinishState extends RewardState {

    @Override
    public void doReward(RewardContext context, RewardRequest request) {
        log.info("进入完成状态，结束流程");
    }

}
