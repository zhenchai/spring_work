package com.zhenchai.spring.beans.factory.support;

import com.zhenchai.spring.beans.BeanDefinition;

/**
 * Created by zhenchai on 2018/7/15 .
 * Description:
 */
public class GenericBeanDefinition implements BeanDefinition {

    private String id;
    private String beanClassName;

    public GenericBeanDefinition(String id, String beanClassName) {
        this.id = id;
        this.beanClassName = beanClassName;
    }

    @Override
    public String getBeanClassName() {
        return this.beanClassName;
    }
}
