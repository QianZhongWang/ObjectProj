package com.hzw.animal;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Java核心技术", "Cay S. Horstmann", "机械工业出版社", 89.00);
        book.showBook();
        System.out.println("-------------------------");
        Book book2 = new Book("红楼梦", "曹雪芹", "人民文学出版社", 5.00);
        book2.showBook();
        System.out.println("-------------------------");
    }
}
