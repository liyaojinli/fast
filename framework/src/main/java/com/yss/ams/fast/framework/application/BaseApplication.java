package com.yss.ams.fast.framework.application;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//springBoot启动注解
@SpringBootApplication
//开启EurekaClient，会注册rest服务到Eureka
@EnableEurekaClient
@EnableDiscoveryClient
//开启FeignClient，支持使用申明式接口访问服务，由于该注解定义在基类，要指定basePackage扫描
@EnableFeignClients(basePackages = "com.yss.ams.fast")
public class BaseApplication {

    @LoadBalanced
    @Bean
    public RestTemplate rest() {
        return new RestTemplate();
    }
}
