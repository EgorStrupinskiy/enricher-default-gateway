package com.innowise.defaultgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayController {
    @GetMapping("/hello")
    public String greeting() {
        return "Hello, it`s default gateway service";
    }
}
