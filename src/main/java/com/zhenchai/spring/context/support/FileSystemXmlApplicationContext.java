package com.zhenchai.spring.context.support;

import com.zhenchai.spring.beans.factory.support.DefaultBeanFactory;
import com.zhenchai.spring.beans.factory.xml.XmlBeanDefinitionReader;
import com.zhenchai.spring.context.ApplicationContext;
import com.zhenchai.spring.core.io.FileSystemResource;

/**
 * Created by zhenchai on 2018/8/4 .
 * Description:
 */
public class FileSystemXmlApplicationContext implements ApplicationContext {

    private DefaultBeanFactory factory = null;

    public FileSystemXmlApplicationContext(String filePath) {
        factory = new DefaultBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(new FileSystemResource(filePath));
    }

    @Override
    public Object getBean(String beanId) {
        return factory.getBean(beanId);
    }
}
