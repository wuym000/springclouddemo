package com.wuym.cloud.clientfeign.controller;

import com.wuym.cloud.clientfeign.feign.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExHelloController {

    @Autowired
    private SchedualServiceHi serviceHi;

    @ResponseBody
    @RequestMapping("exHello")
    public String exHello(String name){
        return serviceHi.exHello(name);
    }
}
