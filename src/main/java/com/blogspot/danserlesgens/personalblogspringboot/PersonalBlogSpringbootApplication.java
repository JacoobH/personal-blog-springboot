package com.blogspot.danserlesgens.personalblogspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.blogspot.danserlesgens.personalblogspringboot.dao")
public class PersonalBlogSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonalBlogSpringbootApplication.class, args);
    }

}
