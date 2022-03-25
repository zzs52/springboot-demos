package com.zzs.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Desc:列注解
 * @author zzs
 * @date 2022/3/25 15:38
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface Column {

    /**
     * 列名
     *
     * @return 列名
     */
    String name();
}
