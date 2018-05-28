package com.wuym.cloud.clientribbon.controller;

import com.wuym.cloud.clientribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;

    @ResponseBody
    @RequestMapping("rbhello")
    public String rbhello(String name){

        return helloService.hello(name);
    }
}
