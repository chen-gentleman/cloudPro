package com.chen.service;

import com.chen.Interface.EurekaClientFeign;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author @Chenxc
 * @Date 2022/9/15 11:44
 */
@Service
public class HiService {
    @Autowired
    private EurekaClientFeign eurekaClientFeign;


    @HystrixCommand(fallbackMethod = "fallback")
    public String sayHi(String name){
        return eurekaClientFeign.sayHi(name);
    }


    public String fallback(String name){
        return name + "，对不起，服务器异常！！！！";
    }
}
