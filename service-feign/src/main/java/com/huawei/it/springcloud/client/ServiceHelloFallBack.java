package com.huawei.it.springcloud.client;


import com.huawei.it.springcloud.domain.User;

public class ServiceHelloFallBack implements IServiceHello {
    @Override
    public String sayHello(User user) {
        return "service fail  not online!!!!";
    }
}
