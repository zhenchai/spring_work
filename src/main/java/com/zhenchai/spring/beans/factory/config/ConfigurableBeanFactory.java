package com.zhenchai.spring.beans.factory.config;


/**
 * Created by zhenchai on 2018/8/4 .
 * Description:
 */
public interface ConfigurableBeanFactory extends AutowireCapableBeanFactory {
    void setBeanClassLoader(ClassLoader beanClassLoader);
    ClassLoader getBeanClassLoader();
}
