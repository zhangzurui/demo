package com.weiguang.demo.designpattern.dynamicproxy.jdkproxy;

/**
 * @author zhangzurui
 * @date 2020/11/30 14:40
 */
public class SubjectImpl implements Subject {

    @Override
    public void hello(String param) {
        System.out.println("hello " + param);
    }
}
