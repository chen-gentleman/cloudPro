package com.chen.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author @Chenxc
 * @Date 2022/8/22 15:21
 */
@RestController
public class HelloController {

    @GetMapping("/hi")
    public String hello(){
        return "hello!i am  eureka-client-8762";
    }

    @GetMapping("/sayHi/{name}")
    public String sayHi(@PathVariable(value = "name",required = false) String name){
        return "hello! "+name+", i am  eureka-client-8762";
    }
}
