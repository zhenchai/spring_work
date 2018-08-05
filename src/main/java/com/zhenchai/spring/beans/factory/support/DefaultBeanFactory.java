package com.zhenchai.spring.beans.factory.support;

import com.zhenchai.spring.beans.BeanDefinition;
import com.zhenchai.spring.beans.factory.BeanCreationException;
import com.zhenchai.spring.beans.factory.config.ConfigurableBeanFactory;
import com.zhenchai.spring.util.ClassUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by zhenchai on 2018/7/15 .
 * Description:
 */
public class DefaultBeanFactory extends DefaultSingletonBeanRegistry
        implements ConfigurableBeanFactory, BeanDefinitionRegistry {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>(64);

    private ClassLoader beanClassLoader;

    public DefaultBeanFactory() {
    }

    @Override
    public Object getBean(String beanId) {
        BeanDefinition bd = this.getBeanDefinition(beanId);
        if (bd == null) {
            throw new BeanCreationException("Bean Definition does not exist");
        }
        if (bd.isSingleton()) {
            Object bean = this.getSingleton(beanId);
            if (bean == null) {
                bean = createBean(bd);
                this.registerSingleton(beanId, bean);
            }
            return bean;
        }
        //非singleton
        return createBean(bd);
    }

    private Object createBean(BeanDefinition bd) {
        ClassLoader cl = this.getBeanClassLoader();
        String beanClassName = bd.getBeanClassName();
        try {
            Class<?> clz = cl.loadClass(beanClassName);
            return clz.newInstance();
        } catch (Exception e) {
            throw new BeanCreationException("create bean for "+ beanClassName +" failed", e);
        }
    }


    @Override
    public BeanDefinition getBeanDefinition(String beanId) {
        return this.beanDefinitionMap.get(beanId);
    }

    @Override
    public void registerBeanDefinition(String beanID, BeanDefinition bd) {
        this.beanDefinitionMap.put(beanID, bd);
    }

    @Override
    public void setBeanClassLoader(ClassLoader beanClassLoader) {
        this.beanClassLoader = beanClassLoader;
    }

    @Override
    public ClassLoader getBeanClassLoader() {
        return (this.beanClassLoader != null ? this.beanClassLoader : ClassUtils.getDefaultClassLoader());
    }
}
