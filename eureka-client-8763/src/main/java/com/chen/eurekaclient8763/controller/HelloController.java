package com.chen.eurekaclient8763.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author @Chenxc
 * @Date 2022/8/22 15:22
 */
@RestController
public class HelloController {
    @Value("${service.service1}")
    private String service;
    @Autowired
    private RestTemplate template;


    @GetMapping("/hi")
    public  String hi(){
        return template.getForObject("http://"+service+"/hi",String.class);
    }
}
