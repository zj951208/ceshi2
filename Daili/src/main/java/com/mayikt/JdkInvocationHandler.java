package com.mayikt;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkInvocationHandler implements InvocationHandler {

    private Object object;

    public JdkInvocationHandler(Object object) {
        this.object = object;
    }

    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println(">>>打印日志开始");
        Object result = method.invoke(object, objects);
        System.out.println(">>>打印日志开始");
        return result;
    }
    public  <T> T getProxy(){
       return (T) Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }
}
