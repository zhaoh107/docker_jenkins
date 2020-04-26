package com.docker.docker_jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("helloworld")
public class HelloWorldController {
    @GetMapping("test")
    public String testHello(){
        HashMap map = new HashMap();
        Map<Object, Object> objectObjectMap = Collections.synchronizedMap(new HashMap<>());
        map.put("12",2);
        System.out.println(1231231);

        return "hello wo shi ahang!";
    }

    public static void main(String[] args) {
        String aa ="aa";
        System.out.println(aa.hashCode());
        int bb = 100;

    }
}
