package com.zhenchai.spring.core.type.classreading;

import com.zhenchai.spring.core.io.Resource;
import com.zhenchai.spring.core.type.AnnotationMetadata;
import com.zhenchai.spring.core.type.ClassMetadata;

/**
 * Created by zhenchai on 2019/2/23 .
 * Description:
 */
public interface MetadataReader {

    /**
     * Return the resource reference for the class file.
     */
    Resource getResource();

    /**
     * Read basic class metadata for the underlying class.
     */
    ClassMetadata getClassMetadata();

    /**
     * Read full annotation metadata for the underlying class,
     * including metadata for annotated methods.
     */
    AnnotationMetadata getAnnotationMetadata();
}
