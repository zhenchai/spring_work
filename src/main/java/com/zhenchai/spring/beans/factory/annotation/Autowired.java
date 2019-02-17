package com.zhenchai.spring.beans.factory.annotation;

import java.lang.annotation.*;

/**
 * Created by zhenchai on 2019/2/17 .
 * Description:
 */
@Target({ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Autowired {

    /**
     * Declares whether the annotated dependency is required.
     * <p>Defaults to {@code true}.
     */
    boolean required() default true;

}
