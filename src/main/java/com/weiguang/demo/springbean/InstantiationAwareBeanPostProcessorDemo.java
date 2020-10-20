package com.weiguang.demo.springbean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

/**
 * @author zhangzurui
 * @date 2020/10/19 11:01
 */
public class InstantiationAwareBeanPostProcessorDemo extends InstantiationAwareBeanPostProcessorAdapter {

    public InstantiationAwareBeanPostProcessorDemo() {
        super();
        System.out.println("这是InstantiationAwareBeanPostProcessorAdapter实现类构造器！！");
    }

    /*** 接口方法、实例化Bean之前调用*/
    @Override
    public Object postProcessBeforeInstantiation(Class beanClass, String beanName) throws BeansException {
        System.out.println("InstantiationAwareBeanPostProcessor调用postProcessBeforeInstantiation方法");
        return null;
    }

    /*** 接口方法、实例化Bean之后调用*/
     @Override
     public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("InstantiationAwareBeanPostProcessor调用postProcessAfterInitialization方法");
        return bean;
     }
}
