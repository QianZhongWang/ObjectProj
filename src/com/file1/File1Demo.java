package com.file1;


import java.io.File;
import java.io.IOException;

public class File1Demo {
    public static void main(String[] args) {


//      File file1 = new File("/Users/qzw/Documents/project/java/ObjectProj/imooc/io/score.txt");
//      File file1 = new File("/Users/qzw/Documents", "project/java/ObjectProj/imooc/io/score.txt");
        File file = new File("/Users/qzw/Documents/project/java/ObjectProj/");
        File file1 = new File(file, "imooc/io/score.txt");

        // 判断是否是文件
        System.out.println("是否是文件" + file1.isFile());

        // 判断是否是目录
        System.out.println("是否是目录" + file1.isDirectory());

        // 创建文件夹
        File file2 = new File(file, "imooc/set/HashSet");
        // 判断文件是否存在
        if (!file2.exists()) {
            // 创建文件
            file2.mkdirs(); // 创建多级目录
            // file2.mkdir(); // 创建单级目录
        } else {
            System.out.println("文件夹已经存在");
        }


        // 创建文件
        if(!file1.exists()){
            try {
                file1.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else {
            System.out.println("文件已经存在");
        }
    }
}
