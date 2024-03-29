package com.example.democlient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@EnableEurekaClient
public class DemoclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoclientApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String hello(@RequestParam(value = "name", defaultValue = "cat") String name){
        return "hi:" + name + ", i am from port:" + port;
    }

}
