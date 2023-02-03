package com.chen.sentinel.service.impl;

import com.chen.sentinel.service.EchoService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author @Chenxc
 * @Date 2022/9/21 16:08
 */
@Component
public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(@PathVariable("name") String name) {
        return "echo fallback,"+name;
    }
}
