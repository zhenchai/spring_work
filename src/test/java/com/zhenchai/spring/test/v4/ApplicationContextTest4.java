package com.zhenchai.spring.test.v4;

import com.zhenchai.spring.context.ApplicationContext;
import com.zhenchai.spring.context.support.ClassPathXmlApplicationContext;
import com.zhenchai.spring.service.v4.PetStoreService;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zhenchai on 2019/2/17 .
 * Description:
 */
public class ApplicationContextTest4 {

    @Test
    public void testGetBeanProperty() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("petstore-v4.xml");
        PetStoreService petStore = (PetStoreService)ctx.getBean("petStore");

        Assert.assertNotNull(petStore.getAccountDao());
        Assert.assertNotNull(petStore.getItemDao());

    }

}
