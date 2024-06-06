package com.serial;

import java.io.*;

public class GoodsTest {
    public static void main(String[] args) {
        Goods goods1 = new Goods("gd001", "电脑", 5000);

//        System.out.println("goods1: " + goods1);

        try {
            FileOutputStream fos = new FileOutputStream("goods.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);


            FileInputStream fis = new FileInputStream("goods.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            oos.writeObject(goods1);
            oos.writeBoolean(true);
            oos.flush();

           Goods goods = (Goods) ois.readObject();

           System.out.println("goods: " + goods);
           System.out.println("ois.readBoolean(): " + ois.readBoolean());

            oos.close();
            fos.close();
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
