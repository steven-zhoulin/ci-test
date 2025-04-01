package com.boot.ci.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    @GetMapping("test")
    public String cache() {
        String uuid = UUID.randomUUID().toString();
        return uuid + "\n";
    }

}