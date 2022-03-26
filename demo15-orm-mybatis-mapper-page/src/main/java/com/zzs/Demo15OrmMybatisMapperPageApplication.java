package com.zzs;

import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.zzs.mapper")
@SpringBootApplication
public class Demo15OrmMybatisMapperPageApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo15OrmMybatisMapperPageApplication.class, args);
    }

}
