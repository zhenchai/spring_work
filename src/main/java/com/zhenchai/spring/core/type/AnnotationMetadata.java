package com.zhenchai.spring.core.type;

import com.zhenchai.spring.core.annotation.AnnotationAttributes;

import java.util.Set;

/**
 * Created by zhenchai on 2019/2/23 .
 * Description:
 */
public interface AnnotationMetadata  extends ClassMetadata {

    Set<String> getAnnotationTypes();

    boolean hasAnnotation(String annotationType);

    public AnnotationAttributes getAnnotationAttributes(String annotationType);
}
