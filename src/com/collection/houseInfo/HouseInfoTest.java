package com.collection.houseInfo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HouseInfoTest {
    public static void main(String[] args) {
        Map<String, HouseInfo> map = new HashMap<String, HouseInfo>();
        int operation = 1;
        Scanner sc = new Scanner(System.in);
        HouseInfoTest test = new HouseInfoTest();
        while (operation != 0) {
            test.introduce();
            System.out.println("请输入您的操作：");
            try {
                operation = sc.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("输入的格式有误，请重新输入！");
                sc.next();
                continue;
            }

            switch (operation) {
                case 1:
                    map = test.addHouseInfo(map, sc);
                    break;
                case 2:
                    test.showHouseInfo(map, sc);
                    break;
                case 3:
                    test.showHouseInfoByRange(map, sc);
                    break;
                case 0:
                    System.out.println("退出房源中心！");
                    break;
                default:
                    System.out.println("输入的操作有误，请重新输入！");
                    break;
            }
        }
    }

    /**
     * 介绍房源中心的操作
     */
    public void introduce() {
        System.out.println("************************************");
        System.out.println("              房源中心               ");
        System.out.println("          1--添加房源信息             ");
        System.out.println("          2--查看具体房源信息          ");
        System.out.println("          3--区间查看房源信息          ");
        System.out.println("          0--退出房源中心              ");
        System.out.println("*************************************");
    }

    /**
     * 添加房源信息
     *
     * @param map
     */
    public Map<String, HouseInfo> addHouseInfo(Map<String, HouseInfo> map, Scanner sc) {
        System.out.println("添加房源信息");
        System.out.println("请输入房屋编号：");
        System.out.println("编号从0开始，并为连续数值，如：0,1,2,3,4...");
        HouseInfo houseInfo = null;
        try {
            String houseId = sc.next();
            System.out.println("请输入房屋名称：");
            String houseName = sc.next();
            System.out.println("请输入房屋地址：");
            String houseAddress = sc.next();
            System.out.println("请输入房屋类型：");
            String houseType = sc.next();
            houseInfo = new HouseInfo(houseId, houseName, houseAddress, houseType);
        } catch (java.util.InputMismatchException e) {
            System.out.println("输入的格式有误，请重新输入！");
            sc.next();
            return map;
        }
        map.put(houseInfo.getHouseId(), houseInfo);
        return map;
    }

    public void showHouseInfo(Map<String, HouseInfo> map, Scanner sc) {
        // 判断HashMap中是否有商品信息
        introduceAllHouseInfo(map);
        System.out.println("请输入您要查看的房源编号：");
        String houseId = null;
        try {
            houseId = sc.next();
        } catch (java.util.InputMismatchException e) {
            System.out.println("输入的格式有误，请重新输入！");
            sc.next();
            return;
        }
        HouseInfo houseInfo = map.get(houseId);
        if (houseInfo == null) {
            System.out.println("房源编号不存在！");
            return;
        }
        System.out.println(houseInfo);

    }

    public void showHouseInfoByRange(Map<String, HouseInfo> map, Scanner sc) {
        // 输出所有房源信息
        introduceAllHouseInfo(map);
        System.out.println("请输入您要查看的房源编号区间：");
        System.out.println("请输入起始房源编号：");
        String startHouseId = null;
        String endHouseId = null;
        try {
            startHouseId = sc.next();
            System.out.println("请输入结束房源编号：");
            endHouseId = sc.next();
        } catch (java.util.InputMismatchException e) {
            System.out.println("输入的格式有误，请重新输入！");
            sc.next();
            return;
        }
        for (String key : map.keySet()) {
            if (key.compareTo(startHouseId) >= 0 && key.compareTo(endHouseId) <= 0) {
                HouseInfo houseInfo = map.get(key);
                System.out.println(houseInfo);
            }
        }

    }

    public void introduceAllHouseInfo(Map<String, HouseInfo> map) {
        if (map.isEmpty()) {
            System.out.println("房源中心暂无房源信息！，请添加房源信息！");
            return;
        }
        System.out.println("全部房源信息");
        for (String key : map.keySet()) {
            HouseInfo houseInfo = map.get(key);
            System.out.println("房源编号" + "      " + "房源名称");
            System.out.println(houseInfo.getHouseId() + "      " + houseInfo.getHouseName());
        }
    }
}
