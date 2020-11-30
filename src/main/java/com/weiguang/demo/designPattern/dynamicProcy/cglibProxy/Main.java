package com.weiguang.demo.designPattern.dynamicProcy.cglibProxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author zhangzurui
 * @date 2020/11/30 15:00
 */
public class Main {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(CGsubject.class);
        enhancer.setCallback(new HelloInterceptor());
        CGsubject cGsubject = (CGsubject) enhancer.create();
        cGsubject.hello();
    }
}
