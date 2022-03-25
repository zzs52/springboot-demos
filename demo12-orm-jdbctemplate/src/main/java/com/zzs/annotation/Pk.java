package com.zzs.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Desc:主键注解
 * @author zzs
 * @date 2022/3/25 15:39
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface Pk {

    /**
     * 自增
     *
     * @return 自增主键
     */
    boolean auto() default true;
}
