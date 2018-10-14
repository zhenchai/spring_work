package com.zhenchai.spring.beans;

/**
 * Created by zhenchai on 2018/10/14 .
 * Description:
 */
public interface TypeConverter {

    <T> T convertIfNecessary(Object value, Class<T> requiredType) throws TypeMismatchException;
}
