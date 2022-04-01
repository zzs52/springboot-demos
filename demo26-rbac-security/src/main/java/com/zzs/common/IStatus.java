package com.zzs.common;

/**
 * Desc:REST API 错误码接口
 * @author zzs
 * @date 2022/3/31 22:08
 */
public interface IStatus {

    /**
     * 状态码
     *
     * @return 状态码
     */
    Integer getCode();

    /**
     * 返回信息
     *
     * @return 返回信息
     */
    String getMessage();

}
