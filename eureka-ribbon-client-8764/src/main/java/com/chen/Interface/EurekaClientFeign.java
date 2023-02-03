package com.chen.Interface;

import com.chen.Interface.hystrixImpl.EurekaClientFeignImpl;
import com.chen.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author @Chenxc
 * @Date 2022/9/15 11:45
 */
@FeignClient(value = "${service.service1}",configuration = FeignConfig.class,fallback = EurekaClientFeignImpl.class)
public interface EurekaClientFeign {
    @GetMapping("/sayHi/{name}")
    String sayHi(@PathVariable(value = "name",required = false) String name);
}
