package com.zzs;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Desc:
 * @author zzs
 * @date 2022/3/27 14:18
 */
public class PasswordTest extends Demo21EmailApplicationTests {

    @Autowired
    private StringEncryptor encryptor;

    /**
     * 生成加密密码
     */
    @Test
    public void testGeneratePassword() {
        // 你的邮箱密码
        String password = "Just4Test!";
        // 加密后的密码(注意：配置上去的时候需要加 ENC(加密密码))
        String encryptPassword = encryptor.encrypt(password);
        String decryptPassword = encryptor.decrypt(encryptPassword);

        System.out.println("password = " + password);
        System.out.println("encryptPassword = " + encryptPassword);
        System.out.println("decryptPassword = " + decryptPassword);
    }
}
