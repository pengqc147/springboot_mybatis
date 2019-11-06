package com.pqc.spring_mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.pqc.spring_mybatis.Mapper")
public class SpringMybatisApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringMybatisApplication.class, args);
    }

}
