package com.zzs.job;

import cn.hutool.core.date.DateUtil;
import com.zzs.job.base.BaseJob;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;

@Slf4j
public class TestJob implements BaseJob {

    @Override
    public void execute(JobExecutionContext context) {
        log.error("Test Job 执行时间: {}", DateUtil.now());
    }
}
