package com.file.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo1 {
    public static void main(String[] args) {
        // 创建一个fileInputStream对象
        try {
            FileInputStream firs = new FileInputStream("test.txt");
            int n = firs.read();
            System.out.println(n);
            System.out.println((char) n);
            firs.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
