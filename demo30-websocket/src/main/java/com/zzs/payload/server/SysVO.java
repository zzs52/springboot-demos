package com.zzs.payload.server;

import com.google.common.collect.Lists;
import com.zzs.model.server.Sys;
import com.zzs.payload.KV;
import lombok.Data;

import java.util.List;

/**
 * Desc:系统相关信息实体VO
 * @author zzs
 * @date 2022/4/14 19:15
 */
@Data
public class SysVO {
    List<KV> data = Lists.newArrayList();

    public static SysVO create(Sys sys) {
        SysVO vo = new SysVO();
        vo.data.add(new KV("服务器名称", sys.getComputerName()));
        vo.data.add(new KV("服务器Ip", sys.getComputerIp()));
        vo.data.add(new KV("项目路径", sys.getUserDir()));
        vo.data.add(new KV("操作系统", sys.getOsName()));
        vo.data.add(new KV("系统架构", sys.getOsArch()));
        return vo;
    }
}
