package com.zhenchai.spring.test.v4;

import com.zhenchai.spring.core.annotation.AnnotationAttributes;
import com.zhenchai.spring.core.io.ClassPathResource;
import com.zhenchai.spring.core.type.classreading.AnnotationMetadataReadingVisitor;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.asm.ClassReader;

/**
 * Created by zhenchai on 2019/2/17 .
 * Description:
 */
public class ClassReaderTest {

    /*
	@Test
	public void testGetClasMetaData() throws IOException {
		ClassPathResource resource = new ClassPathResource("org/litespring/service/v4/PetStoreService.class");
		ClassReader reader = new ClassReader(resource.getInputStream());

		ClassMetadataReadingVisitor visitor = new ClassMetadataReadingVisitor();

		reader.accept(visitor, ClassReader.SKIP_DEBUG);

		Assert.assertFalse(visitor.isAbstract());
		Assert.assertFalse(visitor.isInterface());
		Assert.assertFalse(visitor.isFinal());
		Assert.assertEquals("org.litespring.service.v4.PetStoreService", visitor.getClassName());
		Assert.assertEquals("java.lang.Object", visitor.getSuperClassName());
		Assert.assertEquals(0, visitor.getInterfaceNames().length);
	}*/

    @Test
    public void testGetAnnonation() throws Exception{
        ClassPathResource resource = new ClassPathResource("com/zhenchai/spring/service/v4/PetStoreService.class");
        ClassReader reader = new ClassReader(resource.getInputStream());

        AnnotationMetadataReadingVisitor visitor = new AnnotationMetadataReadingVisitor();

        reader.accept(visitor, ClassReader.SKIP_DEBUG);

        String annotation = "com.zhenchai.spring.stereotype.Component";
        Assert.assertTrue(visitor.hasAnnotation(annotation));

        AnnotationAttributes attributes = visitor.getAnnotationAttributes(annotation);

        Assert.assertEquals("petStore", attributes.get("value"));

    }

}
