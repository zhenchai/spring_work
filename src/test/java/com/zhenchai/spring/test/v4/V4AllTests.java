package com.zhenchai.spring.test.v4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by zhenchai on 2019/3/24 .
 * Description:
 */

@RunWith(Suite.class)
@Suite.SuiteClasses( {ApplicationContextTest4.class, AutowiredAnnotationProcessorTest.class,
                    ClassPathBeanDefinitionScannerTest.class, ClassReaderTest.class,
                    DependencyDescriptorTest.class, InjectionMetadataTest.class,
                    MetadataReaderTest.class, PackageResourceLoaderTest.class,
                    XmlBeanDefinitionReaderTest.class })
public class V4AllTests {
}
