package com.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoodsTest {
    public static void main(String[] args) {
        Goods s1 = new Goods("s1", "手机", 2000);
        Goods s2 = new Goods("s2", "电脑", 5000);
        Goods s3 = new Goods("s3", "电视", 3000);
        List<Goods> goodsList = new ArrayList<Goods>();
        goodsList.add(s1);
        goodsList.add(s2);
        goodsList.add(s3);
        System.out.println("排序前：");
        for (Goods goods : goodsList) {
            System.out.println(goods);
        }
        Collections.sort(goodsList);
        System.out.println("按价格升序排序后：");
        for (Goods goods : goodsList) {
            System.out.println(goods);
        }

    }
}
