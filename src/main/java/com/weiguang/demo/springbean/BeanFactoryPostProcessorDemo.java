package com.weiguang.demo.springbean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author zhangzurui
 * @date 2020/10/19 11:17
 */
public class BeanFactoryPostProcessorDemo implements BeanFactoryPostProcessor {


    public BeanFactoryPostProcessorDemo(){
        super();
        System.out.println("这是BeanFactoryPostProcessor实现类构造器！！");
    }
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("BeanFactoryPostProcessor调用postProcessBeanFactory方法");

        BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition("springBeanLifeCycleDemo");
        beanDefinition.getPropertyValues().add("address",  "融新科技中心");
    }
}
