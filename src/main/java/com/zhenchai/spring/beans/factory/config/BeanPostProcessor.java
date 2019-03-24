package com.zhenchai.spring.beans.factory.config;

import com.zhenchai.spring.beans.BeansException;

/**
 * Created by zhenchai on 2019/3/24 .
 * Description:
 */
public interface BeanPostProcessor {

    Object beforeInitialization(Object bean, String beanName) throws BeansException;


    Object afterInitialization(Object bean, String beanName) throws BeansException;
}
