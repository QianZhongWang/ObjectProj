package com.hzw.animal;

public class Book {
    // 书名
    private String name;
    // 作者
    private String author;
    // 出版社
    private String publisher;
    // 价格
    private double price;

    public Book(String name, String author, String publisher, double price) {
        this.name = name;
        this.author = author;
        this.setPublisher(publisher);
        this.setPrice(price);
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if (price < 10) {
            System.out.println("图书的定价不能低于10元");
            this.price = 10;
        } else {
            this.price = price;
        }
    }

    public void showBook() {
        System.out.println("书名：" + this.name);
        System.out.println("作者：" + this.author);
        System.out.println("出版社：" + this.publisher);
        System.out.println("价格：" + this.price + "元");
    }

}
