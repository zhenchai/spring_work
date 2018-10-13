package com.zhenchai.spring.beans;

import java.util.List;

/**
 * Created by zhenchai on 2018/7/15 .
 * Description:
 */
public interface BeanDefinition {

    public static final String SCOPE_SINGLETION = "singleton";
    public static final String SCOPE_PROTOTYPE = "prototype";
    public static final String SCOPE_DEFAULT = "";

    public boolean isSingleton();
    public boolean isPrototype();
    String getScope();

    void setScope(String scope);

    String getBeanClassName();

    List<PropertyValue> getPropertyValues();
}
