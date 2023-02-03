package com.chen.eurekaribbonclient8764;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication(scanBasePackages = {"com.chen"})
@EnableEurekaClient
@EnableFeignClients(value = {"com.chen"})
@EnableHystrix
public class EurekaRibbonClient8764Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaRibbonClient8764Application.class, args);
    }

}
