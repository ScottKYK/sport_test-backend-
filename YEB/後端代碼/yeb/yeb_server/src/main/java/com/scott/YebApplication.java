package com.scott;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.scott.server.mapper")
public class YebApplication {

    public static void main(String[] args){
        SpringApplication.run(YebApplication.class,args);
    }
}
