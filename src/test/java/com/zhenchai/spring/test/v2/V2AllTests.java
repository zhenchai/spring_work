package com.zhenchai.spring.test.v2;

import com.zhenchai.spring.beans.BeanDefinition;
import com.zhenchai.spring.beans.propertyeditors.CustomNumberEditor;
import com.zhenchai.spring.test.v1.ApplicationContextTest;
import com.zhenchai.spring.test.v1.BeanFactoryTest;
import com.zhenchai.spring.test.v1.ResourceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by zhenchai on 2018/8/4 .
 * Description:
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        ApplicationContextTestV2.class,
        BeanDefinitionTestV2.class,
        BeanDefinitionValueResolverTest.class,
        CustomBooleanEditorTest.class,
        CustomNumberEditorTest.class,
        TypeConverterTest.class
})
public class V2AllTests {
}
