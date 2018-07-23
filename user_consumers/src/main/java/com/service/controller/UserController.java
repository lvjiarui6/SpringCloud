package com.service.controller;

import com.service.UserRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
//@Configuration
//@EnableFeignClients

public class UserController {
/*

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
    @Autowired
     RestTemplate restTemplate;

*/

    @Autowired
   private UserRemote userRemote;

    @GetMapping
    public Object getUser(){
        System.out.println("jinru");
       // return restTemplate.getForEntity("http://service-user/user",String.class).getBody();
        return  userRemote.hello();
    }
}
