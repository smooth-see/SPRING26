package com.example.spring26;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getMessage() {
        return "Hello from SPRING26!";
    }
}