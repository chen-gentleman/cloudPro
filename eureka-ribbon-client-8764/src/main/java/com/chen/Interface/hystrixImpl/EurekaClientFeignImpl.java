package com.chen.Interface.hystrixImpl;

import com.chen.Interface.EurekaClientFeign;
import org.springframework.stereotype.Component;

/**
 * @Author @Chenxc
 * @Date 2022/9/15 15:51
 */
//@Component
public class EurekaClientFeignImpl implements EurekaClientFeign {
    @Override
    public String sayHi(String name) {
        return name + "，对不起，服务器异常！！！！ in EurekaClientFeignImpl";
    }
}
