package com.chen.sentinel.service;

import com.chen.sentinel.config.FeignConfiguration;
import com.chen.sentinel.service.impl.EchoServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author @Chenxc
 * @Date 2022/9/21 16:06
 */
@FeignClient(value = "eureka-client-8762",fallback = EchoServiceImpl.class)
public interface EchoService {
    @GetMapping("/sayHi/{name}")
    String echo(@PathVariable("name") String name);


}
