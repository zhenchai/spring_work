package com.zhenchai.spring.beans.factory.annotation;

import com.zhenchai.spring.beans.BeanDefinition;
import com.zhenchai.spring.core.type.AnnotationMetadata;

/**
 * Created by zhenchai on 2019/2/23 .
 * Description:
 */
public interface AnnotatedBeanDefinition extends BeanDefinition {

    AnnotationMetadata getMetadata();
}


