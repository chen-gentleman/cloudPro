package com.chen.controller;

import com.chen.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author @Chenxc
 * @Date 2022/9/15 11:12
 */
@RestController
public class HiController {
    @Value("${service.service1}")
    private String server;
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HiService hiService;

    @GetMapping("/hi")
    public String hi(){
        return restTemplate.getForObject("http://"+server+"/hi",String.class);
    }

    @GetMapping("/sayHi/{name}")
    public String sayHi(@PathVariable(value = "name",required = false)String name){
        return hiService.sayHi(name);
    }


    @GetMapping("/fallbackSayHi/{name}")
    public String fallbackSayHi(@PathVariable(value = "name",required = false)String name){
        return hiService.sayHi(name);
    }


}
