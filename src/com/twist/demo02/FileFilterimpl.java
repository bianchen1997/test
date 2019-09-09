package com.twist.demo02;

import java.io.File;
import java.io.FileFilter;

public class FileFilterimpl implements FileFilter {

    @Override
    public boolean accept(File file) {
        if (file.isDirectory()) {
            return true;
        }
        return file.getName().toLowerCase().endsWith(".java");
    }
}
