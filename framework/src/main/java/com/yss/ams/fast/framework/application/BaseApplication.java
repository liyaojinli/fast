package com.yss.ams.fast.framework.application;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class BaseApplication {

    @LoadBalanced
    @Bean
    public RestTemplate rest() {
        return new RestTemplate();
    }
}
