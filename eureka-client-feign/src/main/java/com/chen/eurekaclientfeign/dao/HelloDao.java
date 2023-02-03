package com.chen.eurekaclientfeign.dao;

import com.chen.eurekaclientfeign.hystrix.HelloHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author @Chenxc
 * @Date 2022/8/22 15:57
 */
@FeignClient(value = "eureka-client-8762",fallback = HelloHystrix.class)
public interface HelloDao {

    @GetMapping("/hi")
    String hello();
}
