package com.zhenchai.spring.beans.factory;

/**
 * Created by zhenchai on 2018/8/4 .
 * Description:
 */
public interface ConfigurableBeanFactory extends BeanFactory {
    void setBeanClassLoader(ClassLoader beanClassLoader);
    ClassLoader getBeanClassLoader();
}
