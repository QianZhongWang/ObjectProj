package com.generic.genericClass;

public class NumGeneric <T>{
    private T num;

    public T getNum() {
        return num;
    }

    public void setNum(T num) {
        this.num = num;
    }

    public static void main(String[] args) {
        NumGeneric<Integer> num1 = new NumGeneric<>();
        num1.setNum(10);
        System.out.println("Integer Value: " + num1.getNum());

        NumGeneric<Double> num2 = new NumGeneric<>();
        num2.setNum(10.5);
        System.out.println("Double Value: " + num2.getNum());

        NumGeneric<String> num3 = new NumGeneric<>();
        num3.setNum("Hello");
        System.out.println("String Value: " + num3.getNum());
    }
}
