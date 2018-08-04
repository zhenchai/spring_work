package com.zhenchai.spring.core.io;

import java.io.InputStream;

/**
 * Created by zhenchai on 2018/8/4 .
 * Description:
 */
public interface Resource {

    InputStream getInputStream() throws Exception;

    String getDescription();
}
