package com.weiguang.demo.springbean;

import lombok.ToString;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

/**
 * @author zhangzurui
 * @date 2020/10/19 09:57
 */
@ToString
public class SpringBeanLifeCycleDemo implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean{

    private String name;
    private String address;



    private BeanFactory beanFactory;
    private String beanName;


    public SpringBeanLifeCycleDemo(){
        System.out.println("【构造函数】调用SpringBeanLifeCycleDemo的构造器实例化");
    }

    public void setName(String name){
        System.err.println("【注入属性】 注入属性name");
        this.name = "hhah";
//        this.name = name;
    }

    public void setAddress(String address){
        System.err.println("【注入属性】 注入属性address");
        this.address = address;
    }

    /***
     * 通过<bean>的init-method属性指定的初始化方法
     */
    public void beanInitMethod(){
        System.err.println("【init-method】调用<bean>的init-method属性指定的初始化方法");
    }

    /***
     * 通过<bean>的destroy-method属性指定的初始化方法
     */
    public void beanDestoryMethod(){
        System.err.println("【destroy-method】调用<bean>的destroy-method属性指定的初始化方法");
    }

    /**BeanFactoryAware**/
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.err.println("【BeanFactoryAware接口】调用BeanFactoryAware.setBeanFactory()");
        this.beanFactory = beanFactory;
    }

    /**BeanNameAware**/
    @Override
    public void setBeanName(String s) {
        System.err.println("【BeanNameAware接口】调用BeanNameAware.setBeanName()");
        this.beanName = s;
    }

    /**InitializingBean**/
    @Override
    public void afterPropertiesSet() throws Exception {
        System.err.println("【InitializingBean接口】调用InitializingBean.afterPropertiesSet()");
    }

    /**DisposableBean**/
    @Override
    public void destroy() throws Exception {
        System.err.println("【DiposibleBean接口】调用DiposibleBean.destory()");
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

}
