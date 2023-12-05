package com.jason.state;

import lombok.extern.slf4j.Slf4j;

/**
 * 失败
 */
@Slf4j
public class FailState extends RewardState {

    @Override
    public void doReward(RewardContext context, RewardRequest request) {
        log.info("进入失败状态，结束流程");
    }

}
