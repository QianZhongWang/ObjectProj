package com.inherit.animal;

public class Dog extends Animal {
    private String sex;

    public Dog() {
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    // 睡觉方法
    public void sleep() {
        System.out.println(this.getName() + "现在" + this.getAge() + "个月大它在睡觉");
    }

    /*
     * 方法重载
     * 1、同一个类中
     * 2、方法名相同，参数列表不同（参数顺序、个数、类型）
     * 3、方法的反馈值、访问修饰符任意
     * 4、与方法参数名无关
     */

    /*
     * 方法重写
     * 1、有继承关系的子类中
     * 2、方法名相同，参数列表相同（参数顺序，个数，类型）
     * 3、访问修饰符？
     * 4、与方法的参数名无关
     * 5、当方法的返回值是void或基本数据类型时不允许修改为其他类型，当方法的返回值是引用数据类型时，可以修改为其子类
     */
    public void eat() {
        System.out.println(this.getName() + "最近没有什么食欲");
    }

    public void eat(String month) {
        System.out.println(month + "最近没有什么食欲");
    }

//    public int jump() {
//        System.out.println("狗狗是助跑起跳的");
//        return 1;
//    }

}
