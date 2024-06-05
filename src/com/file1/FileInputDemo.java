package com.file1;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fs= new FileInputStream("imooc.txt");
            System.out.println("文件读取成功");
//            int n = fs.read();
//            System.out.println((char)n);
//            fs.close();
            int n= 0;
            while ((n=fs.read())!=-1){
                System.out.print((char)n);
            }
            fs.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
