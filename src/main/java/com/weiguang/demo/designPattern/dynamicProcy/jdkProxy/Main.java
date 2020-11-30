package com.weiguang.demo.designPattern.dynamicProcy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author zhangzurui
 * @date 2020/11/30 14:44
 */
public class Main {

    public static void main(String[] args) {
        Subject subject = new SubjectImpl();
        InvocationHandler invocationHandler = new SubjectProxy(subject);
        //创建动态代理
        Subject proxyInstance = (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), invocationHandler);
        proxyInstance.hello("world");
    }
}
