package com.chen.eurekaclientfeign.hystrix;


import com.chen.eurekaclientfeign.dao.HelloDao;
import org.springframework.stereotype.Component;

/**
 * @Author @Chenxc
 * @Date 2022/8/22 16:27
 */
@Component
public class HelloHystrix implements HelloDao {
    @Override
    public String hello() {
        return "sorry,服务器报错！";
    }
}
