package com.zhenchai.spring.beans.factory.config;

/**
 * Created by zhenchai on 2018/8/5 .
 * Description: 提供实现singleton的能力
 */
public interface SingletonBeanRegistry {

    void registerSingleton(String beanName, Object singletonObject);
    Object getSingleton(String beanName);
}
