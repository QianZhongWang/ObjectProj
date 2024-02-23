package com.generic.genericClass;

public class TwoNumGeneric <T,X>{
    private T num1;
    private X num2;

    public TwoNumGeneric(T num1, X num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public T getNum1() {
        return num1;
    }

    public void setNum1(T num1) {
        this.num1 = num1;
    }

    public X getNum2() {
        return num2;
    }

    public void setNum2(X num2) {
        this.num2 = num2;
    }

    public static void main(String[] args) {
        TwoNumGeneric<Integer,Double> num1 = new TwoNumGeneric<>(10,10.5);
        System.out.println("Integer Value: " + num1.getNum1());
        System.out.println("Double Value: " + num1.getNum2());

        TwoNumGeneric<Double,String> num2 = new TwoNumGeneric<>(10.5,"Hello");
        System.out.println("Double Value: " + num2.getNum1());
        System.out.println("String Value: " + num2.getNum2());

        TwoNumGeneric<String,Integer> num3 = new TwoNumGeneric<>("Hello",10);
        System.out.println("String Value: " + num3.getNum1());
        System.out.println("Integer Value: " + num3.getNum2());
    }
}
