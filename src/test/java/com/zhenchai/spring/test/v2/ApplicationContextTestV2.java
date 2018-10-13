package com.zhenchai.spring.test.v2;

import com.zhenchai.spring.context.ApplicationContext;
import com.zhenchai.spring.context.support.ClassPathXmlApplicationContext;
import com.zhenchai.spring.service.v2.PetStoreService;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by zhenchai on 2018/10/13 .
 * Description:
 */
public class ApplicationContextTestV2 {

    @Test
    public void testGetBeanProperty() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("petstore-v2.xml");
        PetStoreService petStoreService = (PetStoreService) ctx.getBean("petStore");

        assertNotNull(petStoreService.getAccountDao());
        assertNotNull(petStoreService.getItemDao());
    }
}