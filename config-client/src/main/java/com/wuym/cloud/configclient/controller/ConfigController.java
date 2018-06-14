package com.wuym.cloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    @Value("${from}")
    private String version;
    @Value("${custom.env}")
    private String env;
    @RequestMapping("getProp")
    public String getProp(){

        return env + "环境,版本号为" + version;
    }
}
