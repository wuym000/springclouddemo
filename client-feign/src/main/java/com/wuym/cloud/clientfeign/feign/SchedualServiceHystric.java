package com.wuym.cloud.clientfeign.feign;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHystric implements SchedualServiceHi {
    @Override
    public String exHello(String name) {
        return "sorry " + name;
    }
}
