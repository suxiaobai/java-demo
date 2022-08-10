package com.example.demo;

import feign.Logger;
import org.springframework.context.annotation.Bean;

public class TestFeignClientConfig {

    @Bean
    Logger.Level feignLogLevel() {
        return Logger.Level.FULL;
    }
}
