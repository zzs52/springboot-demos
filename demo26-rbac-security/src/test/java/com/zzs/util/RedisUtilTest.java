package com.zzs.util;

import cn.hutool.json.JSONUtil;
import com.zzs.Demo26RbacSecurityApplicationTests;
import com.zzs.common.Consts;
import com.zzs.common.PageResult;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Desc:测试RedisUtil
 * @author zzs
 * @date 2022/4/1 9:16
 */
@Slf4j
public class RedisUtilTest extends Demo26RbacSecurityApplicationTests {
    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void findKeysForPage() {
        PageResult pageResult = redisUtil.findKeysForPage(Consts.REDIS_JWT_KEY_PREFIX + Consts.SYMBOL_STAR, 2, 1);
        log.info("【pageResult】= {}", JSONUtil.toJsonStr(pageResult));
    }
}
