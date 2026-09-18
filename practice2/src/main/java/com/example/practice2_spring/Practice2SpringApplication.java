package com.example.practice2_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class Practice2SpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(Practice2SpringApplication.class, args);
    }
}