package com.mso.api_ai.controller;


import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mso.api_ai.model.Greeting;
import com.mso.api_ai.configuration.Capitalizer;

import com.mso.api_ai.service.HelloService;

@RestController
@RequestMapping("/api")
public class HelloController {
    private final HelloService helloService;
    private static final AtomicLong COUNTER = new AtomicLong();
    private final String template; 

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
        this.template = this.helloService.mensagem();
    }
  
     @GetMapping("/mensagem")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(COUNTER.incrementAndGet(), String.format(this.template, Capitalizer.converterName(name)));
    }

 
}
