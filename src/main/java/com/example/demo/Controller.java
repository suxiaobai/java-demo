package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private TestFeignClient testFeignClient;

    @RequestMapping("/")
    public List<String> getHello() {
        return testFeignClient.getHello();
    }

    @RequestMapping("/hello")
    public List<String> echoHello() {
        List<String> s = Arrays.asList("1", "2", "3", "4");
        return s;
    }
}
