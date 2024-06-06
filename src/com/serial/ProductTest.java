package com.serial;

import java.io.*;

public class ProductTest {
    public static void main(String[] args) {
        Product iphone = new Product("123", "iphone", "telephone", 4888.0);
        Product ipad = new Product("124", "ipad", "computer", 3888.0);
        Product macbook = new Product("125", "macbook", "computer", 9888.0);
        Product iwatch = new Product("126", "iwatch", "watch", 2888.0);


        try {
            FileOutputStream fos = new FileOutputStream("product.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            FileInputStream fis = new FileInputStream("product.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            oos.writeObject(iphone);
            oos.writeObject(ipad);
            oos.writeObject(macbook);
            oos.writeObject(iwatch);
            oos.flush();


            Product p1 = (Product) ois.readObject();
            Product p2 = (Product) ois.readObject();
            Product p3 = (Product) ois.readObject();
            Product p4 = (Product) ois.readObject();

            System.out.println("p1: " + p1);
            System.out.println("p2: " + p2);
            System.out.println("p3: " + p3);
            System.out.println("p4: " + p4);

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
