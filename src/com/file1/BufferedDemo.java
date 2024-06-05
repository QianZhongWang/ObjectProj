package com.file1;

import sun.awt.geom.AreaOp;

import java.io.*;

public class BufferedDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("imooc.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            FileInputStream fis = new FileInputStream("imooc.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            bos.write(50);
            bos.write('a');
            bos.write('b');
            bos.write('c');
            bos.flush();

            System.out.println(bis.read());
            System.out.println((char)bis.read());
            bos.close();
            fos.close();
            fis.close();
            bis.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
