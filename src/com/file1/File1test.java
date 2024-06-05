package com.file1;

import java.io.File;
import java.io.IOException;

public class File1test {
    public static void main(String[] args) {

        File file = new File("/Users/qzw/Documents/project/java/ObjectProj/imooc/File/Monday.docx");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        if (file.exists()) {
            System.out.println("文件创建成功");
            System.out.println("文件名称：" + file.getName());
            // 获取上一级目录
            System.out.println("文件上一级目录：" + file.getParent());
            // 获取文件绝对路径
            System.out.println("文件绝对路径：" + file.getAbsolutePath());
            // 判断是文件还是目录
            System.out.println("文件/目录：这是一个" + (file.isFile() ? "文件" : "目录"));
            // 判断文件读写性
            System.out.println("文件读写性：" + (file.canRead() ? "可读" : "不可读") + " " + (file.canWrite() ? "可写" : "不可写"));
        }



    }
}
