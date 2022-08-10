package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestFeignClient testFeignClient;

    @Override
    public List<String> getHello() {
        return testFeignClient.getHello();
    }
}
