package com.file1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("imooc.txt");
            FileInputStream fis = new FileInputStream("imooc.txt");

            fos.write(50);
            fos.write('A');
            fos.close();

            int n = 0;
            while ((n = fis.read()) != -1) {
                System.out.println((char) n);
            }
            fis.close();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
