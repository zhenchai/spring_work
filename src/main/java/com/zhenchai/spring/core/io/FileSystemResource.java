package com.zhenchai.spring.core.io;

import com.zhenchai.spring.util.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by zhenchai on 2018/8/4 .
 * Description:
 */
public class FileSystemResource implements Resource {

    private final String filePath;
    private final File file;

    public FileSystemResource(File file) {
        this.filePath = file.getPath();
        this.file = file;
    }

    public FileSystemResource(String filePath) {
        Assert.notNull(filePath, "Path must not be null");
        this.filePath = filePath;
        this.file = new File(filePath);
    }

    @Override
    public InputStream getInputStream() throws FileNotFoundException {
        return new FileInputStream(this.file);
    }

    @Override
    public String getDescription() {
        return "file ["+ this.file.getAbsolutePath() +"]";
    }
}
