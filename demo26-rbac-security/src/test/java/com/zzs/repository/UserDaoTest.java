package com.zzs.repository;

import com.zzs.Demo26RbacSecurityApplicationTests;
import com.zzs.model.User;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Lists;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Desc:UserDao 测试
 * @author zzs
 * @date 2022/4/1 9:20
 */
@Slf4j
public class UserDaoTest extends Demo26RbacSecurityApplicationTests {
    @Autowired
    private UserDao userDao;

    @Test
    public void findByUsernameIn() {
        List<String> usernameList = Lists.newArrayList("admin", "user");
        List<User> userList = userDao.findByUsernameIn(usernameList);
        Assert.assertEquals(2, userList.size());
        log.info("【userList】= {}", userList);
    }
}
