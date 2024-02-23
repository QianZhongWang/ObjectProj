package com.generic.genericMethod;

public class GenericMethod {
    public <T> void printValue(T value) {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        gm.printValue(10);
        gm.printValue(10.5);
        gm.printValue("Hello");
    }
}
