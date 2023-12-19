package com.inherit.fruits;

public class Fruits {
    // 私有属性：水果的形状（shape）和口感（taste）
    private String shape;
    private String taste;

    // 无参构造方法
    public Fruits() {
    }

    // 带参构造方法，实现对形状和口感属性的赋值
    public Fruits(String shape, String taste) {
        this.setShape(shape);
        this.setTaste(taste);
    }

    // 通过封装实现对私有属性的get/set操作

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public void eat() {
        System.out.println("水果可以供人们食用！");
    }

    public boolean equals(Fruits fruit) {
        if (fruit == null) {
            return false;
        }
        return this.getShape().equals(fruit.getShape()) && this.getTaste().equals(fruit.getTaste());
    }


}
