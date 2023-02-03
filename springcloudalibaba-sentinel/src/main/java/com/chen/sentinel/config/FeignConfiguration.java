package com.chen.sentinel.config;

import com.chen.sentinel.service.impl.EchoServiceImpl;
import org.springframework.context.annotation.Bean;

/**
 * @Author @Chenxc
 * @Date 2022/9/21 16:16
 */
public class FeignConfiguration {
    @Bean
    public EchoServiceImpl echoServiceFallback() {
        return new EchoServiceImpl();
    }
}
