package com.example.practice2_spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

    private final AppProperties appProperties;

    public AppRunner(AppProperties appProperties) {
        this.appProperties = appProperties;
    }

    @Override
    public void run(String... args) {
        System.out.println("Application: " + appProperties.getName());
        System.out.println("Environment: " + appProperties.getEnvironment());
        System.out.println("Message: " + appProperties.getMessage());
    }
}