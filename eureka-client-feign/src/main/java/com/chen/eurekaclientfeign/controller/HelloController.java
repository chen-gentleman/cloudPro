package com.chen.eurekaclientfeign.controller;

import com.chen.eurekaclientfeign.dao.HelloDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author @Chenxc
 * @Date 2022/8/22 15:59
 */
@RestController
public class HelloController {
    @Autowired
    private HelloDao helloDao;


    @GetMapping("/hi")
    private String hello(){
        //int i = 10/0;
        return helloDao.hello();
    }
}
