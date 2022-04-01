package com.zzs.payload;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * Desc:登录请求参数
 * @author zzs
 * @date 2022/3/31 22:19
 */
@Data
public class LoginRequest {

    /**
     * 用户名或邮箱或手机号
     */
    @NotBlank(message = "用户名不能为空")
    private String usernameOrEmailOrPhone;

    /**
     * 密码
     */
    @NotBlank(message = "密码不能为空")
    private String password;

    /**
     * 记住我
     */
    private Boolean rememberMe = false;
}
