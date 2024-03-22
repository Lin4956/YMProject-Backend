package com.ymproject;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.ymproject.mapper")
@SpringBootApplication
public class YmProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(YmProjectApplication.class, args);
    }

}
