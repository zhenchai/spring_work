package com.zhenchai.spring.test.v4;

import com.zhenchai.spring.core.io.Resource;
import com.zhenchai.spring.core.io.support.PackageResourceLoader;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by zhenchai on 2019/2/17 .
 * Description:
 */
public class PackageResourceLoaderTest {
    @Test
    public void testGetResources() throws IOException {
        PackageResourceLoader loader = new PackageResourceLoader();
        Resource[] resources = loader.getResources("com.zhenchai.spring.dao.v4");
        Assert.assertEquals(2, resources.length);

    }
}
