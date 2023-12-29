package com.collection.arrayList;

import java.util.ArrayList;

public class ListDemo2 {
    public static void main(String[] args) {
        // 用ArrayList存储学科的名称
        ArrayList<String> list = new ArrayList<>();
        list.add("语文");
        list.add("数学");
        list.add("英语");
        list.add("化学");
        list.add("物理");
        list.add("生物");

        System.out.println("列出列表中元素的个数" + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println("第"+(i+1)+"个为："+list.get(i));
        }
    }
}
