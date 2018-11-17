package com.yss.ams.fast.systemmanager.interface4Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "right")
public interface RightFeignService {
    @RequestMapping("/right/rest/{name}")
    String helloRest(@PathVariable(value = "name") String name);
}
