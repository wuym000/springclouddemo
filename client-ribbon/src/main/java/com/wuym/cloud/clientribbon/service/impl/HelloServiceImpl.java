package com.wuym.cloud.clientribbon.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wuym.cloud.clientribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "hiError")
    public String hello(String name) {
        return restTemplate.getForObject("http://service-cli1/hello?name=" + name,String.class);
    }

    public String hiError(String name){
        return "hi," + name + "error";
    }
}
