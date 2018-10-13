package com.zhenchai.spring.beans.factory.config;

/**
 * Created by zhenchai on 2018/10/13 .
 * Description:
 */
public class RuntimeBeanReference {

    private final String beanName;

    public RuntimeBeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
