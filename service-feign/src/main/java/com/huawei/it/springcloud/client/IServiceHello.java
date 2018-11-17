package com.huawei.it.springcloud.client;

import com.huawei.it.springcloud.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "test2",fallback = ServiceHelloFallBack.class)
public interface IServiceHello {

    @RequestMapping(value = "helloBody",method = RequestMethod.GET)
    String sayHello(@RequestBody User user);
}
