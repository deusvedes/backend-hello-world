package com.swisscom.taaweni0.demoapp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@Slf4j
public class WorldController {
    String host = "https://taaweni0-hello-world-hello-world.azuremicroservices.io";
    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        log.info("hello called successfully");
        String response = "Hello World at: " + LocalDateTime.now();
        MultiValueMap<String, String> responseHeaders = new LinkedMultiValueMap<String, String>();
        responseHeaders.add(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, host);
        return new ResponseEntity<>(response, responseHeaders, HttpStatus.OK);
    }
}
