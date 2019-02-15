package com.zhenchai.spring.test;

import com.zhenchai.spring.test.v1.V1AllTests;
import com.zhenchai.spring.test.v2.V2AllTests;
import com.zhenchai.spring.test.v3.V3AllTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by zhenchai on 2019/2/15 .
 * Description:
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({V1AllTests.class,V2AllTests.class,V3AllTests.class})
public class AllTests {
}
