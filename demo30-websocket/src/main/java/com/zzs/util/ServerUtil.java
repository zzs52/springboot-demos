package com.zzs.util;

import cn.hutool.core.lang.Dict;
import com.zzs.model.Server;
import com.zzs.payload.ServerVO;

/**
 * Desc:服务器转换工具类
 * @author zzs
 * @date 2022/4/14 19:10
 */
public class ServerUtil {
    /**
     * 包装成 ServerVO
     *
     * @param server server
     * @return ServerVO
     */
    public static ServerVO wrapServerVO(Server server) {
        ServerVO serverVO = new ServerVO();
        serverVO.create(server);
        return serverVO;
    }

    /**
     * 包装成 Dict
     *
     * @param serverVO serverVO
     * @return Dict
     */
    public static Dict wrapServerDict(ServerVO serverVO) {
        Dict dict = Dict.create().set("cpu", serverVO.getCpu().get(0).getData()).set("mem", serverVO.getMem().get(0).getData()).set("sys", serverVO.getSys().get(0).getData()).set("jvm", serverVO.getJvm().get(0).getData()).set("sysFile", serverVO.getSysFile().get(0).getData());
        return dict;
    }
}
