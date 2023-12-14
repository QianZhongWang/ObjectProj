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

}
