package com.zhenchai.spring.beans.factory.support;

import com.zhenchai.spring.beans.BeanDefinition;

/**
 * Created by zhenchai on 2018/7/22 .
 * Description: BeanDefinition注册类
 */
public interface BeanDefinitionRegistry {
    BeanDefinition getBeanDefinition(String beanId);
    void registerBeanDefinition(String beanID, BeanDefinition bd);
}
