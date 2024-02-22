package com.generic.SellDemo;

import java.util.List;

public class GoodsSeller {
    public void sellGoods(List<? extends Goods> goodsList) {
        for (Goods goods : goodsList) {
            goods.sell();
        }
    }
}
