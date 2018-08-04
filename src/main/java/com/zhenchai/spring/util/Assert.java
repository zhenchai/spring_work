package com.zhenchai.spring.util;

/**
 * Created by zhenchai on 2018/8/4 .
 * Description:
 */
public abstract class Assert {

    public static void notNull(Object object, String message) {
        if (object == null) {
            throw new IllegalArgumentException(message);
        }
    }

}
