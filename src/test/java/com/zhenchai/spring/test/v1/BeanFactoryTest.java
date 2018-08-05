package com.zhenchai.spring.test.v1;

import com.zhenchai.spring.beans.BeanDefinition;
import com.zhenchai.spring.beans.factory.BeanCreationException;
import com.zhenchai.spring.beans.factory.BeanDefinitionStoreException;
import com.zhenchai.spring.beans.factory.BeanFactory;
import com.zhenchai.spring.beans.factory.support.DefaultBeanFactory;
import com.zhenchai.spring.beans.factory.xml.XmlBeanDefinitionReader;
import com.zhenchai.spring.core.io.ClassPathResource;
import com.zhenchai.spring.service.v1.PetStoreService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhenchai on 2018/7/15 .
 * Description: bean测试类
 */
public class BeanFactoryTest {

    DefaultBeanFactory factory;
    XmlBeanDefinitionReader reader;

    @Before
    public void setUp() {
        factory = new DefaultBeanFactory();
        reader = new XmlBeanDefinitionReader(factory);
    }

    @Test
    public void testGetBean() {
        reader.loadBeanDefinitions(new ClassPathResource("petstore-v1.xml"));

        BeanDefinition bd = factory.getBeanDefinition("petStore");

        assertTrue(bd.isSingleton());

        assertFalse(bd.isPrototype());

        assertEquals(BeanDefinition.SCOPE_DEFAULT, bd.getScope());


        assertEquals("com.zhenchai.spring.service.v1.PetStoreService", bd.getBeanClassName());

        PetStoreService petStore = (PetStoreService) factory.getBean("petStore");

        assertNotNull(petStore);

        PetStoreService petStore1 = (PetStoreService)factory.getBean("petStore");

        assertTrue(petStore.equals(petStore1));
    }

    @Test
    public void testInvalidBean() {

        reader.loadBeanDefinitions(new ClassPathResource("petstore-v1.xml"));
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
            reader.loadBeanDefinitions(new ClassPathResource("xxx.xml"));
        } catch (BeanDefinitionStoreException e) {
            return;
        }
        Assert.fail("expect BeanDefinitionStoreException ");
    }
}
