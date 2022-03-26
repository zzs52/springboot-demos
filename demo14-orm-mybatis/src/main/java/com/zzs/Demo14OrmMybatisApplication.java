package com.zzs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = {"com.zzs.mapper"})
@SpringBootApplication
public class Demo14OrmMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo14OrmMybatisApplication.class, args);
    }

}
