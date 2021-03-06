package com.zzs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Demo20CacheEhcacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo20CacheEhcacheApplication.class, args);
    }

}
