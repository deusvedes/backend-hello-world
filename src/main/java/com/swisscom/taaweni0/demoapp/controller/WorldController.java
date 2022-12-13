package com.swisscom.taaweni0.demoapp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@Slf4j
public class WorldController {
    @GetMapping("/hello")
    public String hello() {
        log.info("hello called successfully");
        return "Hello World at: " + LocalDateTime.now();
    }
}
