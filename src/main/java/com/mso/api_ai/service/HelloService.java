package com.mso.api_ai.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    
    public String mensagem() {
        return "Hello, %S!";
    }
}
