package com.example.demo.controller;

import com.example.demo.config.BitlyConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final BitlyConfiguration bitlyConfiguration;

    // BitlyConfiguration is injected by Spring
    public TestController(BitlyConfiguration bitlyConfiguration) {
        this.bitlyConfiguration = bitlyConfiguration;
    }

    // Execute me with: curl --location --request GET 'localhost:8080/test'
    @GetMapping("/test")
    public void testMethod() {
        System.out.println("Helloooo");
        System.out.println("Secret 1: " + bitlyConfiguration.getMysecret1());
        System.out.println("Secret 2: " + bitlyConfiguration.getMysecret2());
    }

}
