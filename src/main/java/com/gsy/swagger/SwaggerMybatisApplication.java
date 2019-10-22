package com.gsy.swagger;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.gsy.swagger.mybatis.mapper")
@EnableSwagger2
public class SwaggerMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerMybatisApplication.class, args);
    }

}
