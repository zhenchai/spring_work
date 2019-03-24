package com.zhenchai.spring.context.support;

import com.zhenchai.spring.beans.factory.annotation.AutowiredAnnotationProcessor;
import com.zhenchai.spring.beans.factory.config.ConfigurableBeanFactory;
import com.zhenchai.spring.beans.factory.support.DefaultBeanFactory;
import com.zhenchai.spring.beans.factory.xml.XmlBeanDefinitionReader;
import com.zhenchai.spring.context.ApplicationContext;
import com.zhenchai.spring.core.io.Resource;
import com.zhenchai.spring.util.ClassUtils;

/**
 * Created by zhenchai on 2018/8/4 .
 * Description: ApplicationContext模板方法
 */
public abstract class AbstractApplicationContext implements ApplicationContext {

    private DefaultBeanFactory factory = null;
    private ClassLoader beanClassLoader;


    public AbstractApplicationContext(String configFile) {
        factory = new DefaultBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        Resource resource = this.getResourceByPath(configFile);
        reader.loadBeanDefinitions(resource);
        registerBeanPostProcessors(factory);
    }


    public Object getBean(String BeanID) {
        return factory.getBean(BeanID);
    }

    protected abstract Resource getResourceByPath(String path);

    public ClassLoader getBeanClassLoader() {
        return (this.beanClassLoader != null ? this.beanClassLoader : ClassUtils.getDefaultClassLoader());
    }

    public void setBeanClassLoader(ClassLoader beanClassLoader) {
        this.beanClassLoader = beanClassLoader;
    }

    protected void registerBeanPostProcessors(ConfigurableBeanFactory beanFactory) {

        AutowiredAnnotationProcessor postProcessor = new AutowiredAnnotationProcessor();
        postProcessor.setBeanFactory(beanFactory);
        beanFactory.addBeanPostProcessor(postProcessor);

    }

}
