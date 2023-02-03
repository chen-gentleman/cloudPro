package com.chen.nacosdiscovery8770;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosDiscovery8770Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosDiscovery8770Application.class, args);
    }

}
