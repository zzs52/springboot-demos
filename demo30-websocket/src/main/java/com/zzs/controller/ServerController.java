package com.zzs.controller;

import cn.hutool.core.lang.Dict;
import com.zzs.model.Server;
import com.zzs.payload.ServerVO;
import com.zzs.util.ServerUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desc:服务器监控Controller
 * @author zzs
 * @date 2022/4/14 19:20
 */
@RestController
@RequestMapping("/server")
public class ServerController {

    @GetMapping
    public Dict serverInfo() throws Exception {
        Server server = new Server();
        server.copyTo();
        ServerVO serverVO = ServerUtil.wrapServerVO(server);
        return ServerUtil.wrapServerDict(serverVO);
    }

}
