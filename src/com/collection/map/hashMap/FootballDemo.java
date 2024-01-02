package com.collection.map.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FootballDemo {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("2014", "德国");
        hashMap.put("2010", "西班牙");
        hashMap.put("2006", "意大利");
        hashMap.put("2002", "巴西");
        hashMap.put("1998", "法国");

        Iterator<String> it = hashMap.values().iterator();
        System.out.println("使用迭代器方式进行输出：");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println("\n使用entrySet方式进行输出：");
        Iterator<String> it2 = hashMap.keySet().iterator();
        while (it2.hasNext()) {
            String key = it2.next();
            System.out.print(key + "--->" + hashMap.get(key) + " ");
        }
        System.out.println("\n使用entrySet方式进行输出：");
        Iterator it3 = hashMap.entrySet().iterator();
        while (it3.hasNext()) {
            Entry entry = (Entry) it3.next();
            System.out.print(entry.getKey() + "--->" + entry.getValue() + " ");
        }
        Set<Entry<String, String>> entrySet = hashMap.entrySet();
        System.out.println("\n使用entrySet方式进行输出：");
        for (Entry<String, String> entry : entrySet) {
            System.out.print(entry.getKey() + "--->" + entry.getValue() + " ");
        }

    }


}
