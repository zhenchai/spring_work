package com.zhenchai.spring.context.annotation;

import com.zhenchai.spring.beans.factory.annotation.AnnotatedBeanDefinition;
import com.zhenchai.spring.beans.factory.support.GenericBeanDefinition;
import com.zhenchai.spring.core.type.AnnotationMetadata;

/**
 * Created by zhenchai on 2019/2/23 .
 * Description:
 */
public class ScannedGenericBeanDefinition extends GenericBeanDefinition implements AnnotatedBeanDefinition {

    private final AnnotationMetadata metadata;

    public ScannedGenericBeanDefinition(AnnotationMetadata metadata) {
        super();
        this.metadata = metadata;
        setBeanClassName(this.metadata.getClassName());
    }

    @Override
    public final AnnotationMetadata getMetadata() {
        return this.metadata;
    }
}
