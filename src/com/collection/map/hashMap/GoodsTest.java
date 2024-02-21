package com.collection.map.hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class GoodsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 定义HashMap对象
        HashMap<String, Goods> goodsMap = new HashMap<String, Goods>();

        System.out.println("请输入商品的编号：");

        int i = 0;
        while (i < 3) {
            System.out.println("请输入第" + (i + 1) + "商品的信息");
            System.out.println("请输入商品的编号：");
            String goodsId = scanner.next();
            // 判断商品编号是否存在
            if (goodsMap.containsKey(goodsId)) {
                System.out.println("商品编号已经存在，请重新输入！");
                continue;
            }
            System.out.println("请输入商品的名称：");
            String goodsName = scanner.next();
            System.out.println("请输入商品的价格：");
            double goodsPrice =0;
            try{
                goodsPrice = scanner.nextDouble();
            }catch (java.util.InputMismatchException e){
                System.out.println("输入的价格格式有误，请重新输入！");
                scanner.next();
                continue;
            }
            // 创建商品对象
            Goods goods = new Goods(goodsId, goodsName, goodsPrice);
            // 添加商品到HashMap中
            goodsMap.put(goodsId, goods);
            System.out.println("添加成功！");
            i++;
        }

        // 输出HashMap中的商品信息
        System.out.println("商品信息：");
        for (String key : goodsMap.keySet()) {
            Goods goods = goodsMap.get(key);
            System.out.println(goods);
        }

    }


}
