package com.jurumin.springboot_developer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${OAUTH_CLIENT_ID}")
    private String clientId;

    @GetMapping("/test-key")
    public String testKey() {
        return clientId;
    }
}

