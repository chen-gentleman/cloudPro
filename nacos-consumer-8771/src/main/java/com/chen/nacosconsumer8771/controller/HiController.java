package com.chen.nacosconsumer8771.controller;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author @Chenxc
 * @Date 2022/9/19 17:17
 */
@RestController
public class HiController implements EnvironmentAware {

    @Autowired
    private RestTemplate restTemplate;
    @Value("${spring.application.name}")
    private String appName;
    @Value("${serviceprovider.service1}")
    private String service;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    private Environment environment;

    @GetMapping("/echo1/app-name")
    public String echoAppName(){
        return restTemplate.getForObject("http://"+service+"/echo/"+appName,String.class);
    }

    @GetMapping("/echo2/app-name")
    public String echoAppName2(){
        //使用 LoadBalanceClient 和 RestTemplate 结合的方式来访问
        ServiceInstance serviceInstance = loadBalancerClient.choose(service);
        String url = String.format("http://%s:%s/echo/%s",serviceInstance.getHost(),serviceInstance.getPort(),appName);
        System.out.println("request url:"+url);
        return restTemplate.getForObject(url,String.class);
    }


    @GetMapping("/getConfigByProperties")
    public String getConfigByProperties(){
        String name = environment.getProperty("user.name");
        String age = environment.getProperty("user.age");
        return "name = " + name + ",age=" + age;
    }


    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
