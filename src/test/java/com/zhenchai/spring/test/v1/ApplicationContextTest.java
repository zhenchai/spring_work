package com.zhenchai.spring.test.v1;

import com.zhenchai.spring.context.ApplicationContext;
import com.zhenchai.spring.context.support.ClassPathXmlApplicationContext;
import com.zhenchai.spring.service.v1.PetStoreService;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zhenchai on 2018/8/4 .
 * Description: applicationContextTest
 */
public class ApplicationContextTest {

    @Test
    public void testGetBean() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("petstore-v1.xml");
        PetStoreService petStore = (PetStoreService)ctx.getBean("petStore");
        Assert.assertNotNull(petStore);
    }
}
