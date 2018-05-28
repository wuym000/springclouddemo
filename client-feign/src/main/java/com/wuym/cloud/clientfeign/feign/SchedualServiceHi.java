package com.wuym.cloud.clientfeign.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-cli1", fallback = SchedualServiceHystric.class)
public interface SchedualServiceHi {
    @RequestMapping("hello")
    String exHello(@RequestParam("name") String name);
}
