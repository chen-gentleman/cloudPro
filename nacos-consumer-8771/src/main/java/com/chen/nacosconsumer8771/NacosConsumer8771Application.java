package com.chen.nacosconsumer8771;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosConsumer8771Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosConsumer8771Application.class, args);
    }

}
