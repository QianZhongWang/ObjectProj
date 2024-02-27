package com.file.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        // 创建File对象
        File file = new File("/Users/qzw/Documents/project/java/ObjectProj/src/com/file/imooc/io/score.txt");
        System.out.println(file);
        // 判断是文件还是目录
        System.out.println("是否是目录" + file.isDirectory());
        System.out.println("是否是文件" + file.isFile());

        File file1 = new File("/Users/qzw/Documents/project/java/ObjectProj/src/com/file/imooc/io", "score.txt");
        System.out.println("是否是目录" + file1.isDirectory());
        System.out.println("是否是文件" + file1.isFile());

        File file2 = new File("/Users/qzw/Documents/project/java/ObjectProj/src/com/file/imooc/io");
        System.out.println("是否是目录" + file2.isDirectory());
        System.out.println("是否是文件" + file2.isFile());
        File file3 = new File(file2, "score.txt");
        System.out.println("是否是目录" + file3.isDirectory());
        System.out.println("是否是文件" + file3.isFile());

        // 创建目录
        File file4 = new File("/Users/qzw/Documents/project/java/ObjectProj/src/com/file/imooc/set", "hashSet");
        if (!file4.exists()) {
            file4.mkdirs();
        }
        // 创建文件
        if (!file1.exists()) {
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
