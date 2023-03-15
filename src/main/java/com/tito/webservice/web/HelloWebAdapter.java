package com.tito.webservice.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWebAdapter {

    @GetMapping("/")
    public ResponseEntity<String> getHello() {
        return ResponseEntity.ok("Hello Web Adapter");
    }
}
