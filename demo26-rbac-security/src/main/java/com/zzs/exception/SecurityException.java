package com.zzs.exception;

import com.zzs.common.BaseException;
import com.zzs.common.Status;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Desc:全局异常
 * @author zzs
 * @date 2022/3/31 22:15
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SecurityException extends BaseException {
    public SecurityException(Status status) {
        super(status);
    }

    public SecurityException(Status status, Object data) {
        super(status, data);
    }

    public SecurityException(Integer code, String message) {
        super(code, message);
    }

    public SecurityException(Integer code, String message, Object data) {
        super(code, message, data);
    }
}
