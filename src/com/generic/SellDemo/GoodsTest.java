package com.generic.SellDemo;

import java.util.ArrayList;
import java.util.List;

public class GoodsTest {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book());
        books.add(new Book());

        List<Clothes> clothes = new ArrayList<>();
        clothes.add(new Clothes());
        clothes.add(new Clothes());

        List<Shoes> shoes = new ArrayList<>();
        shoes.add(new Shoes());
        shoes.add(new Shoes());

        GoodsSeller goodsSeller = new GoodsSeller();
        goodsSeller.sellGoods(books); // >> Sell Books  ? extends Goods



        List<Goods> goodsList = new ArrayList<>();
        goodsList.addAll(books);
        goodsList.addAll(clothes);
        goodsList.addAll(shoes);
        goodsSeller.sellGoods(goodsList);

    }
}
