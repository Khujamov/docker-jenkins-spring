package com.restgo.demo.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Khumoyun Khujamov
 * Date: 9/23/20
 * Time: 12:14 PM
 */
@RestController
@RequestMapping("api/v1")
public class HelloController {

    @GetMapping
    public HttpEntity<?> sayHello() {
        return ResponseEntity.ok("Hello");
    }
}
