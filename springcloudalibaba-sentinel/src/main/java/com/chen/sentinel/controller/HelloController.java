package com.chen.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.chen.sentinel.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author @Chenxc
 * @Date 2022/9/21 11:30
 */
@RestController
public class HelloController {
    @Autowired
    public EchoService service;

    @GetMapping("/hello")
    @SentinelResource(value = "sayHello",fallback = "helloFallback")
    public String hello(){
        return "Hello!Sentinel!";
    }

    public String helloFallback(){
        return "请勿频繁操作，thanks！";
    }

    @GetMapping("/sayHi/{name}")
    public String sayHi(@PathVariable(value = "name",required = false) String name){
        return service.echo(name);
    }
}
