package com.twist.demo02;

import java.io.File;
import java.io.FileFilter;

public class FileTest {
    public static void main(String[] args) {
        File file = new File(".");
        getAllFileNoName(file);
    }

    public static void getAllFile(File dir) {
        File[] files = dir.listFiles(
                new FileFilterimpl());
        for (File file :
                files) {
            if (file.isDirectory())
                getAllFile(file);
            else
                System.out.println(file.getName());
        }
    }

    public static void getAllFileNoName(File dir) {
       File[] files = dir.listFiles(new FileFilter() {
           @Override
           public boolean accept(File file) {
               return file.isDirectory()|| file.getName().toLowerCase().endsWith(".java");
           }
       });
        for (File file :
                files) {
            if (file.isDirectory())
                getAllFileNoName(file);
            else
                System.out.println(file.getName());
        }
    }
}
