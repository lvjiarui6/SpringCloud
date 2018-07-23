package com.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
@RequestMapping("/user")
public class UserController {


    @GetMapping
    public Mono<String> getUser(){
       long nowTime= System.currentTimeMillis();

       /* try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        long cTime=System.currentTimeMillis()-nowTime;
       Mono mono= Mono.just("fdsafdsaf").delayElement(Duration.ofSeconds(2));
        System.out.println("用时"+cTime);
        return mono;
    }
}
