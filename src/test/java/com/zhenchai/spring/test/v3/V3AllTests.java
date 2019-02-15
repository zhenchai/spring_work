package com.zhenchai.spring.test.v3;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by zhenchai on 2019/2/15 .
 * Description:
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ApplicationContextTestV3.class, BeanDefinitionTestV3.class, ConstructorResolverTest.class})
public class V3AllTests {
}
