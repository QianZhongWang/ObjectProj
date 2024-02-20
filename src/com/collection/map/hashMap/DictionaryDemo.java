package com.collection.map.hashMap;

import java.util.*;
import java.util.Map.Entry;

public class DictionaryDemo {
    public static void main(String[] args) {
        Map<String, String> animal = new HashMap<>();
        System.out.println("请输入三组单词对应的注释，并存放到HashMap中");
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            System.out.println("请输入key值（单词）：");
            String key = sc.next();
            System.out.println("请输入value值（注释）：");
            String value = sc.next();
            animal.put(key, value);
            i++;
        }
        System.out.println("*****************************");
        System.out.println("HashMap中的元素为：");
        System.out.println(animal);

        Iterator<String> it = animal.values().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        Set<Map.Entry<String, String>> entrySet = animal.entrySet();
        for (Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }

        // 通过单词找到注释并输出
        // 使用keySet方法
        String strSearch = sc.next();

        // 1.取得keySet
        Set<String> keySet = animal.keySet();
        // 2.遍历keySet
        for (String key : keySet) {
            if (strSearch.equals(key)) {
                System.out.println("找到了" + key + "对应的value值为" + animal.get(key));
                break;
            }
        }



    }
}
