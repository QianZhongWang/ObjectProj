package com.file1;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedDemoTest {
    public static void main(String[] args) {
        // 将100000个字符分别写入文件one.txt和文件two.txt，one用不加缓冲的文件输出流来写，two用缓冲文件输出流来写，比较用时的多少。

        // 不加缓冲的文件输出流
        long start = System.currentTimeMillis();
        try {
            FileOutputStream fos = new FileOutputStream("one.txt");
            for (int i = 0; i < 100000; i++) {
                fos.write('a');
            }
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
        long end = System.currentTimeMillis();
        System.out.println("不加缓冲的文件输出流用时：" + (end - start) + "ms");

        // 加缓冲的文件输出流
        start = System.currentTimeMillis();
        try {
            FileOutputStream fos = new FileOutputStream("two.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            for (int i = 0; i < 100000; i++) {
                bos.write('a');
            }
            bos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
        end = System.currentTimeMillis();
        System.out.println("加缓冲的文件输出流用时：" + (end - start) + "ms");

    }
}
