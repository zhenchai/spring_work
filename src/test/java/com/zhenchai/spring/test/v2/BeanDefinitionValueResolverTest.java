package com.zhenchai.spring.test.v2;

import com.zhenchai.spring.beans.factory.config.RuntimeBeanReference;
import com.zhenchai.spring.beans.factory.config.TypedStringValue;
import com.zhenchai.spring.beans.factory.support.BeanDefinitionValueResolver;
import com.zhenchai.spring.beans.factory.support.DefaultBeanFactory;
import com.zhenchai.spring.beans.factory.xml.XmlBeanDefinitionReader;
import com.zhenchai.spring.core.io.ClassPathResource;
import com.zhenchai.spring.dao.v2.AccountDao;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zhenchai on 2018/10/13 .
 * Description:
 */
public class BeanDefinitionValueResolverTest {

    @Test
    public void testResolveRuntimeBeanReference() {
        DefaultBeanFactory factory = new DefaultBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(new ClassPathResource("petstore-v2.xml"));

        BeanDefinitionValueResolver resolver = new BeanDefinitionValueResolver(factory);

        RuntimeBeanReference reference = new RuntimeBeanReference("accountDao");
        Object value = resolver.resolveValueIfNecessary(reference);

        Assert.assertNotNull(value);
        Assert.assertTrue(value instanceof AccountDao);
    }
    @Test
    public void testResolveTypedStringValue() {
        DefaultBeanFactory factory = new DefaultBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(new ClassPathResource("petstore-v2.xml"));

        BeanDefinitionValueResolver resolver = new BeanDefinitionValueResolver(factory);

        TypedStringValue stringValue = new TypedStringValue("test");
        Object value = resolver.resolveValueIfNecessary(stringValue);
        Assert.assertNotNull(value);
        Assert.assertEquals("test", value);

    }
}
