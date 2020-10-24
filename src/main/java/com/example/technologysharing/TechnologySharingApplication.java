package com.example.technologysharing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.example.technologysharing.mapper")
public class TechnologySharingApplication {

    public static void main(String[] args) {
        SpringApplication.run(TechnologySharingApplication.class, args);
    }

}
