package com.example;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.mapper")
@SpringBootApplication
public class SpringbootHeadlinePartApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootHeadlinePartApplication.class, args);
    }

}
