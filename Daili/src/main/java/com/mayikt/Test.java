package com.mayikt;

import com.mayikt.service.OrderService;
import com.mayikt.service.impl.OrderServiceImpl;

public class Test {

    public static void main(String[] args) {
        //jdk实现动态代理
        OrderService proxy = new JdkInvocationHandler(new OrderServiceImpl()).getProxy();
        proxy.order();
    }
}
