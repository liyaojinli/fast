package com.yss.ams.fast.zuulserver;

import com.yss.ams.fast.framework.application.BaseApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@EnableZuulProxy
public class ZuulServerApplication extends BaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulServerApplication.class, args);
    }
}
