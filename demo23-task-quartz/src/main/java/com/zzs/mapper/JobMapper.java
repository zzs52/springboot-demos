package com.zzs.mapper;

import com.zzs.entity.domain.JobAndTrigger;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface JobMapper {
    /**
     * 查询定时作业和触发器列表
     *
     * @return 定时作业和触发器列表
     */
    List<JobAndTrigger> list();
}
