package com.zhenchai.spring.context.support;

import com.zhenchai.spring.beans.factory.support.DefaultBeanFactory;
import com.zhenchai.spring.beans.factory.xml.XmlBeanDefinitionReader;
import com.zhenchai.spring.context.ApplicationContext;
import com.zhenchai.spring.core.io.ClassPathResource;

/**
 * Created by zhenchai on 2018/8/4 .
 * Description: ApplicationContext实现
 */
public class ClassPathXmlApplicationContext implements ApplicationContext {

    private DefaultBeanFactory factory = null;

    public ClassPathXmlApplicationContext(String configFile) {
        factory = new DefaultBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(new ClassPathResource(configFile));
    }

    @Override
    public Object getBean(String beanId) {
        return factory.getBean(beanId);
    }
}
