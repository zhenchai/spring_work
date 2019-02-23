package com.zhenchai.spring.test.v4;

import com.zhenchai.spring.core.annotation.AnnotationAttributes;
import com.zhenchai.spring.core.io.ClassPathResource;
import com.zhenchai.spring.core.type.AnnotationMetadata;
import com.zhenchai.spring.core.type.classreading.MetadataReader;
import com.zhenchai.spring.core.type.classreading.SimpleMetadataReader;
import com.zhenchai.spring.stereotype.Component;
import org.junit.Assert;
import org.junit.Test;


/**
 * Created by zhenchai on 2019/2/23 .
 * Description:
 */
public class MetadataReaderTest {

    @Test
    public void testGetMetadata() throws Exception {
        ClassPathResource resource = new ClassPathResource("com/zhenchai/spring/service/v4/PetStoreService.class");

        MetadataReader reader = new SimpleMetadataReader(resource);
        //注意：不需要单独使用ClassMetadata
        //ClassMetadata clzMetadata = reader.getClassMetadata();
        AnnotationMetadata amd = reader.getAnnotationMetadata();

        String annotation = Component.class.getName();

        Assert.assertTrue(amd.hasAnnotation(annotation));
        AnnotationAttributes attributes = amd.getAnnotationAttributes(annotation);
        Assert.assertEquals("petStore", attributes.get("value"));

        //注：下面对class metadata的测试并不充分
        Assert.assertFalse(amd.isAbstract());
        Assert.assertFalse(amd.isFinal());
        Assert.assertEquals("com.zhenchai.spring.service.v4.PetStoreService", amd.getClassName());

    }
}
