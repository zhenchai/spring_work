package com.zhenchai.spring.beans.factory.config;

import com.zhenchai.spring.beans.factory.BeanFactory;

/**
 * Created by zhenchai on 2018/8/4 .
 * Description:
 */
public interface ConfigurableBeanFactory extends BeanFactory {
    void setBeanClassLoader(ClassLoader beanClassLoader);
    ClassLoader getBeanClassLoader();
}
