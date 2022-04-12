package com.zzs.common;

import lombok.Getter;

/**
 * Desc:通用状态枚举
 * @author zzs
 * @date 2022/4/12 18:14
 */
@Getter
public enum ResultCode implements IResultCode {
    /**
     * 成功
     */
    OK(200, "成功"),
    /**
     * 失败
     */
    ERROR(500, "失败");

    /**
     * 返回码
     */
    private Integer code;

    /**
     * 返回消息
     */
    private String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
