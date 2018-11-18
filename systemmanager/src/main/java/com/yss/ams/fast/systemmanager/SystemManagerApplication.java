package com.yss.ams.fast.systemmanager;

import com.yss.ams.fast.framework.application.BaseApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.yss.ams.fast.systemmanager")
public class SystemManagerApplication extends BaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(SystemManagerApplication.class, args);
    }
}
