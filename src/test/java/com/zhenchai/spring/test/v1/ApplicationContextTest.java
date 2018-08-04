package com.zhenchai.spring.test.v1;

import com.zhenchai.spring.context.ApplicationContext;
import com.zhenchai.spring.context.support.ClassPathXmlApplicationContext;
import com.zhenchai.spring.context.support.FileSystemXmlApplicationContext;
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

//    @Test
//    public void testGetBeanFromFileSystemContext(){
//        //注意啊，这里仍然是hardcode了一个本地路径，这是不好的实践!! 如何处理，留作作业
//		ApplicationContext ctx = new FileSystemXmlApplicationContext("C:\\Users\\liuxin\\git-litespring\\src\\test\\resources\\petstore-v1.xml");
//		PetStoreService petStore = (PetStoreService)ctx.getBean("petStore");
//		Assert.assertNotNull(petStore);
//    }
}
