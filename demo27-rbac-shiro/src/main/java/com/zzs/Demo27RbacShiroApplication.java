package com.zzs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zzs.mapper")
@SpringBootApplication
public class Demo27RbacShiroApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo27RbacShiroApplication.class, args);
    }

}
