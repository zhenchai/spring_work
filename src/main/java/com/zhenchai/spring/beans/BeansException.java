package com.zhenchai.spring.beans;

/**
 * Created by zhenchai on 2018/7/15 .
 * Description: beans的基本异常类
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
