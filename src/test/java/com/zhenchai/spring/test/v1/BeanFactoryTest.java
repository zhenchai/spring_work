package com.zhenchai.spring.test.v1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.zhenchai.spring.beans.BeanDefinition;
import com.zhenchai.spring.beans.factory.BeanCreationException;
import com.zhenchai.spring.beans.factory.BeanDefinitionStoreException;
import com.zhenchai.spring.beans.factory.BeanFactory;
import com.zhenchai.spring.beans.factory.support.DefaultBeanFactory;
import com.zhenchai.spring.service.v1.PetStoreService;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zhenchai on 2018/7/15 .
 * Description: bean测试类
 */
public class BeanFactoryTest {

    @Test
    public void testGetBean() {

        BeanFactory factory = new DefaultBeanFactory("petstore-v1.xml");

        BeanDefinition bd = factory.getBeanDefinition("petStore");

        assertEquals("com.zhenchai.spring.service.v1.PetStoreService", bd.getBeanClassName());

        PetStoreService petStore = (PetStoreService) factory.getBean("petStore");

        assertNotNull(petStore);
    }

    @Test
    public void testInvalidBean() {

        BeanFactory factory = new DefaultBeanFactory("petstore-v1.xml");
        try {
            factory.getBean("invalidBean");
        } catch (BeanCreationException e) {
            return;
        }
        Assert.fail("expect BeanCreationException ");
    }

    @Test
    public void testInvalidXML() {
        try {
            new DefaultBeanFactory("xxx.xml");
        } catch (BeanDefinitionStoreException e) {
            return;
        }
        Assert.fail("expect BeanDefinitionStoreException ");
    }
}
