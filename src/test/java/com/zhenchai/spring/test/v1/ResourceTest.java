package com.zhenchai.spring.test.v1;

import com.zhenchai.spring.core.io.ClassPathResource;
import com.zhenchai.spring.core.io.FileSystemResource;
import com.zhenchai.spring.core.io.Resource;
import org.junit.Assert;
import org.junit.Test;

import java.io.InputStream;

/**
 * Created by zhenchai on 2018/8/4 .
 * Description:
 */
public class ResourceTest {

    @Test
    public void testClassPathResource() throws Exception {

        Resource r = new ClassPathResource("petstore-v1.xml");

        InputStream is = null;

        try {
            is = r.getInputStream();
            // 注意：这个测试其实并不充分！！
            Assert.assertNotNull(is);
        } finally {
            if (is != null) {
                is.close();
            }
        }

    }

//    @Test
//    public void testFileSystemResource() throws Exception {
//
//		Resource r = new FileSystemResource("C:\\Users\\liuxin\\git-litespring\\src\\test\\resources\\petstore-v1.xml");
//
//		InputStream is = null;
//
//		try {
//			is = r.getInputStream();
//			// 注意：这个测试其实并不充分！！
//			Assert.assertNotNull(is);
//		} finally {
//			if (is != null) {
//				is.close();
//			}
//		}
//
//    }
}
