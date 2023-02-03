package com.chen.nacosdiscovery8770.controller;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author @Chenxc
 * @Date 2022/9/19 16:58
 */
@RestController
public class HiController implements ApplicationContextAware, EnvironmentAware {

    private ApplicationContext applicationContext;
    private Environment environment;

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        return "Hello Nacos Discovery " + string;
    }

    @GetMapping("/getConfigByYamlAndApplication")
    public String getConfigByYamlAndApplication(){
        String name = applicationContext.getEnvironment().getProperty("name");
        String age = applicationContext.getEnvironment().getProperty("age");
        return "name = " + name + ",age=" + age;
    }


    @GetMapping("/getConfigByYamlAndEnvironment")
    public String getConfigByYamlAndEnvironment(){
        String name = environment.getProperty("name");
        String age = environment.getProperty("age");
        return "name = " + name + ",age=" + age;
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
