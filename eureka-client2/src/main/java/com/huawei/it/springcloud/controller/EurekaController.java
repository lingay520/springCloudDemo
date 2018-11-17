package com.huawei.it.springcloud.controller;

import com.huawei.it.springcloud.domain.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class EurekaController {
    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String name(@RequestParam String name ){
        return "Hello"+ name+", call success ! service port  is :"+port;
    }
    @RequestMapping("/helloBody")
    public String helloBody(@RequestBody User user){

        return "HelloBody"+ user.getName()+", call success ! service port  is :"+port;
    }

}
