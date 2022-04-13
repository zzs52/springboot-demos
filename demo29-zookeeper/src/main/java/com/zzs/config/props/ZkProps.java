package com.zzs.config.props;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Desc:Zookeeper 配置项
 * @author zzs
 * @date 2022/4/13 11:40
 */
@Data
@ConfigurationProperties(prefix = "zk")
public class ZkProps {
    /**
     * 连接地址
     */
    private String url;

    /**
     * 超时时间(毫秒)，默认1000
     */
    private int timeout = 1000;

    /**
     * 重试次数，默认3
     */
    private int retry = 3;
}
