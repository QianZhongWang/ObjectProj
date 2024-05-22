package com.file.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("test.txt");
            fos.write(97);
            fos.write('a');
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println("文件未找到");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("文件读写错误");
            e.printStackTrace();
        }
    }

}