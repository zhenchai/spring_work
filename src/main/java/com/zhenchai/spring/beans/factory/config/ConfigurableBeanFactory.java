package com.zhenchai.spring.beans.factory.config;


import java.util.List;

/**
 * Created by zhenchai on 2018/8/4 .
 * Description:
 */
public interface ConfigurableBeanFactory extends AutowireCapableBeanFactory {
    void setBeanClassLoader(ClassLoader beanClassLoader);
    ClassLoader getBeanClassLoader();

    void addBeanPostProcessor(BeanPostProcessor postProcessor);
    List<BeanPostProcessor> getBeanPostProcessors();
}
