package com.zhenchai.spring.core.io;

import com.zhenchai.spring.util.ClassUtils;

import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by zhenchai on 2018/8/4 .
 * Description:
 */
public class ClassPathResource implements Resource {

    private String configPath = null;
    private ClassLoader classLoader = null;

    public ClassPathResource(String configPath) {
        this(configPath, null);
    }

    public ClassPathResource(String configPath, ClassLoader classLoader) {
        this.configPath = configPath;
        this.classLoader = (classLoader != null) ? classLoader : ClassUtils.getDefaultClassLoader();
    }

    @Override
    public InputStream getInputStream() throws Exception {
        InputStream is = this.classLoader.getResourceAsStream(this.configPath);

        if (is == null) {
            throw new FileNotFoundException(configPath + "cannot be opened");
        }
        return is;
    }

    @Override
    public String getDescription() {
        return this.configPath;
    }
}
