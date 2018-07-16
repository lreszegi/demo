package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Laszlo Reszegi (v-lreszegi@expedia.com)
 */
@RestController
public class DemoController {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World 12345678!";
    }
}
