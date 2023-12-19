package com.inherit.fruits;

public class Waxberry extends Fruits {
    // 私有属性：颜色（color）
    private String color;

    // 创建构造方法，完成调用父类的构造方法，完成属性的赋值
    public Waxberry() {
        super();
    }

    public Waxberry(String shape, String taste, String color) {
        super(shape, taste);
        this.setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 创建不允许重写的face方法，描述：杨梅：**、**，果味酸甜适中
    public final void face() {
        System.out.println("杨梅：" + this.getColor() + "、" + this.getShape() + "，果味酸甜适中！");
    }

    // 重写父类eat方法，描述内容为：杨梅酸甜适中，非常好吃！
    public void eat() {
        System.out.println("杨梅酸甜适中，非常好吃！");
    }



    // 重写toString方法，输出的表现形式不同（输出shape,color,taste）
    public String toString() {
        return "杨梅的信息：果实为" + this.getShape() + "、" + this.getColor() + "，果肉酸甜适中！";
    }

}
