package com.file.file;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        boolean created = false;
        // 创建文件对象
        File file = new File("/Users/qzw/Documents/project/java/ObjectProj/src/com/file/imooc/io/", "Monday.docx");
        // 创建文件
        if (!file.exists()) {
            try {
                created = file.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (created) {
            System.out.println("文件创建成功");
        } else {
            System.out.println("文件创建失败");
        }

        System.out.println("文件是否存在：" + file.exists());
        System.out.println("文件的名称"+file.getName());
        System.out.println("文件的上一级目录"+file.getParent());
        System.out.println("文件的绝对路径"+file.getAbsolutePath());
        System.out.println("文件的路径"+file.getPath());
        System.out.println("文件是否是目录"+file.isDirectory());
        System.out.println("文件的读写性"+file.canRead());
        System.out.println("文件的可执行性"+file.canExecute());


    }
}
