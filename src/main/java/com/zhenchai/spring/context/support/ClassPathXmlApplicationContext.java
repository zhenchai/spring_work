package com.zhenchai.spring.context.support;

import com.zhenchai.spring.core.io.ClassPathResource;
import com.zhenchai.spring.core.io.Resource;

/**
 * Created by zhenchai on 2018/8/4 .
 * Description: ApplicationContext实现
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext {

    public ClassPathXmlApplicationContext(String configFile) {
        super(configFile);
    }

    @Override
    protected Resource getResourceByPath(String path) {
        return new ClassPathResource(path, this.getBeanClassLoader());
    }
}
