package com.zhenchai.spring.beans.factory;

import com.zhenchai.spring.beans.BeanDefinition;

/**
 * Created by zhenchai on 2018/7/15 .
 * Description: 
 */
public interface BeanFactory {

    Object getBean(String beanId);

    BeanDefinition getBeanDefinition(String beanId);
}
