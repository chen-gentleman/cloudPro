package com.chen.configserver8769;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServer8769Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer8769Application.class, args);
    }

}
