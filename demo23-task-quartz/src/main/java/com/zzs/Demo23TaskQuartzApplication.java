package com.zzs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = {"com.zzs.mapper"})
@SpringBootApplication
public class Demo23TaskQuartzApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo23TaskQuartzApplication.class, args);
    }

}
