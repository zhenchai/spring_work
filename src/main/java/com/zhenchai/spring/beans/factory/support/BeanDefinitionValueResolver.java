package com.zhenchai.spring.beans.factory.support;

import com.zhenchai.spring.beans.factory.config.RuntimeBeanReference;
import com.zhenchai.spring.beans.factory.config.TypedStringValue;

import java.lang.reflect.Type;

/**
 * Created by zhenchai on 2018/10/13 .
 * Description:
 */
public class BeanDefinitionValueResolver {

    private final DefaultBeanFactory beanFactory;

    public BeanDefinitionValueResolver(DefaultBeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }


    public Object resolveValueIfNecessary(Object value) {

        if (value instanceof RuntimeBeanReference) {
            RuntimeBeanReference reference = (RuntimeBeanReference) value;
            String refName = reference.getBeanName();
            Object bean = this.beanFactory.getBean(refName);
            return bean;
        } else if (value instanceof TypedStringValue) {
            return ((TypedStringValue) value).getValue();
        } else {
            throw new RuntimeException("the value " + value + "has not implemented");
        }
    }
}
