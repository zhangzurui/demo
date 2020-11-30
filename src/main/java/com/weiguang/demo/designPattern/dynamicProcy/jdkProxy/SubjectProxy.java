package com.weiguang.demo.designPattern.dynamicProcy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zhangzurui
 * @date 2020/11/30 14:41
 */
public class SubjectProxy implements InvocationHandler {

    private Subject subject;

    public SubjectProxy(Subject subject){
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("before ....");
        Object invoke = method.invoke(subject, args);
        System.out.println("after ....");
        return invoke;
    }
}
