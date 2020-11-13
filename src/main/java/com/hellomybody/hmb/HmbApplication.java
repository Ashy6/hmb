package com.hellomybody.hmb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//扫描dao层的包
@MapperScan("com.hellomybody.hmb.dao")
@SpringBootApplication
public class HmbApplication {

    public static void main(String[] args) {
        SpringApplication.run(HmbApplication.class, args);
    }

}

