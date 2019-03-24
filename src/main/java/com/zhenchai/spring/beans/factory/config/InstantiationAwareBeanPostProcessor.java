package com.zhenchai.spring.beans.factory.config;

import com.zhenchai.spring.beans.BeansException;

/**
 * Created by zhenchai on 2019/3/24 .
 * Description:
 */
public interface InstantiationAwareBeanPostProcessor extends BeanPostProcessor {

    Object beforeInstantiation(Class<?> beanClass, String beanName) throws BeansException;

    boolean afterInstantiation(Object bean, String beanName) throws BeansException;

    void postProcessPropertyValues(Object bean, String beanName)
            throws BeansException;
}
