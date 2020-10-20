package com.weiguang.demo.springbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangzurui
 * @date 2020/10/19 09:52
 */
public class SpringBeanLifecycleTest {

    public static void main(String[] args){

        System.out.println("现在开始初始化容器");

        ApplicationContext factory = new ClassPathXmlApplicationContext("springbeanTest.xml");
        System.out.println("初始化容器");

        SpringBeanLifeCycleDemo demo = factory.getBean("springBeanLifeCycleDemo", SpringBeanLifeCycleDemo.class);
        System.out.println(demo.toString());

        System.out.println("现在关闭容器");
        ((ClassPathXmlApplicationContext)factory).registerShutdownHook();



    }
}
