package com.zhenchai.spring.test.v1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by zhenchai on 2018/8/4 .
 * Description:
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        ApplicationContextTest.class,
        BeanFactoryTest.class,
        ResourceTest.class
})
public class V1AllTests {
}
