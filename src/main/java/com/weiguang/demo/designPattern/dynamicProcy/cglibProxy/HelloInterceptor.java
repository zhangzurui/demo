package com.weiguang.demo.designPattern.dynamicProcy.cglibProxy;


import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

/**
 * @author zhangzurui
 * @date 2020/11/30 14:49
 */
public class HelloInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib before ...");
        methodProxy.invokeSuper(o, objects);
        System.out.println("cglib after ...");
        return null;
    }
}