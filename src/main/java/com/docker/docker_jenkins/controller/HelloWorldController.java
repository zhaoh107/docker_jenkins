package com.docker.docker_jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("helloworld")
public class HelloWorldController {
    @GetMapping("test")
    public String testHello(){
        return "hello wo shi zhaohang!";
    }
}
