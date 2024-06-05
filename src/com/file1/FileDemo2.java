package com.file1;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try {
            file.createNewFile();
            // 是否是绝对路径
            System.out.println("文件是绝对路径吗？"+file.isAbsolute());
            // 获取相对路径
            System.out.println("文件的相对路径是："+file.getPath());
            // 获取绝对路径
            System.out.println("文件的相对路径是："+file.getAbsolutePath());
            // 获取文件明
            System.out.println("文件的名称是："+file.getName());
            // 获取文件的父路径

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
