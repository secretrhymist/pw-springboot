package com.shareJoy.pw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.sharejoy.pw.mapper")
@SpringBootApplication
public class PwSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(PwSpringbootApplication.class, args);
    }

}
