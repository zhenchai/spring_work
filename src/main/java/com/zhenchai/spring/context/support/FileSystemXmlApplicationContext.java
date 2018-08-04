package com.zhenchai.spring.context.support;

import com.zhenchai.spring.core.io.FileSystemResource;
import com.zhenchai.spring.core.io.Resource;

/**
 * Created by zhenchai on 2018/8/4 .
 * Description:
 */
public class FileSystemXmlApplicationContext extends AbstractApplicationContext {

    public FileSystemXmlApplicationContext(String filePath) {
        super(filePath);
    }

    @Override
    protected Resource getResourceByPath(String path) {
        return new FileSystemResource(path);
    }
}
