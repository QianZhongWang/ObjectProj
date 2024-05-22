package com.file.file;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo2 {
    public static void main(String[] args) {
        // 创建一个fileInputStream对象
        try {
            FileInputStream firs = new FileInputStream("test.txt");
            byte[] b = new byte[100];
            firs.read(b);
            System.out.println(new String(b));
            firs.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
