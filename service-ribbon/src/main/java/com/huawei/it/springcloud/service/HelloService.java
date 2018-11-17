package com.huawei.it.springcloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;



    public String helloService(String name){
//        return restTemplate.getForObject("http://localhost:8923/hello?name="+name,String.class);
        return restTemplate.getForObject("http://test2/hello?name="+name,String.class);
//
    }
}
