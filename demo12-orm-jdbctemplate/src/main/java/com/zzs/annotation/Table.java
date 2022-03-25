package com.zzs.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Desc:表注解
 * @author zzs
 * @date 2022/3/25 15:40
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Table {

    /**
     * 表名
     *
     * @return 表名
     */
    String name();
}
