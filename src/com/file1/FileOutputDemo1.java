package com.file1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo1 {
    public static void main(String[] args) {
        // 文件拷贝
        try {
            FileInputStream fis = new FileInputStream("logo2020.png");
            FileOutputStream fos = new FileOutputStream("logo2020_copy.png");
            int n = 0;
            byte[] b = new byte[1024];
            while ((n = fis.read(b)) != -1) {
                fos.write(b, 0, n);
            }
            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // 文件复制
    }
}
