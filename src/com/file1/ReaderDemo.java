package com.file1;

import java.io.*;

public class ReaderDemo {
    public static void main(String[] args) {


        try {
            FileInputStream fis = new FileInputStream("imooc.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            FileOutputStream fos = new FileOutputStream("imooc1.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);

            int n = 0;
            char[] cbuf = new char[10];
//            while ((n = isr.read()) != -1) {
//                System.out.println((char)n);
//            }

//            while((n = isr.read(cbuf)) != -1) {
//                System.out.println(new String(cbuf, 0, n));
//            }

            while ((n = isr.read(cbuf)) != -1) {
                osw.write(cbuf, 0, n);
                osw.flush();
            }


            fis.close();
            isr.close();
            fos.close();
            osw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
