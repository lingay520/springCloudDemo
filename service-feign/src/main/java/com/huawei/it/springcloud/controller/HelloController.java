package com.huawei.it.springcloud.controller;

import com.huawei.it.springcloud.client.IServiceHello;
import com.huawei.it.springcloud.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    IServiceHello serviceHello;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name ){
        User user = new User();
        user.setName(name);
        return  serviceHello.sayHello(user);

    }
}
