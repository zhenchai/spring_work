package com.zhenchai.spring.beans.factory;

import com.zhenchai.spring.beans.BeansException;

/**
 * Created by zhenchai on 2018/7/15 .
 * Description:
 */
public class BeanDefinitionStoreException extends BeansException {

    public BeanDefinitionStoreException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
