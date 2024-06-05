package com.file1;

import java.io.FileInputStream;

public class FileInputDemo1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("imooc.txt");
            byte[] b = new byte[100];
            fis.read(b,0, 5);
            System.out.println(new String(b));
            fis.close();
        } catch (Exception e) {

            throw new RuntimeException(e);
        }
    }
}
