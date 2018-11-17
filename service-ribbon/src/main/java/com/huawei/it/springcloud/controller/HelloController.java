package com.huawei.it.springcloud.controller;

import com.huawei.it.springcloud.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    HelloService helloService;

    @RequestMapping("/hello")
    public String hello(@RequestParam String name ){
        return helloService.helloService(name);
    }
}
