package com.file1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("speech.txt");
            int n = 0, count = 0;
            while ((n = fis.read()) != -1) {
                System.out.print((char) n);
                count++;
            }
            System.out.println();
            fis.close();
            System.out.println("speech.txt文件中共有"+count+"个字节");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}
