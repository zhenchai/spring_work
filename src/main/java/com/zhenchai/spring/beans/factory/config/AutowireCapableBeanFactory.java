package com.zhenchai.spring.beans.factory.config;

import com.zhenchai.spring.beans.factory.BeanFactory;

/**
 * Created by zhenchai on 2019/3/10 .
 * Description:
 */
public interface AutowireCapableBeanFactory extends BeanFactory {
    public Object resolveDependency(DependencyDescriptor descriptor);
}
