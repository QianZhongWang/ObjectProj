package com.hzw.animal;

public class Cat2 {
    private String name;
    private int month;


    private double weight;

    private String species;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setMonth(int month) {
        if (month <= 0)
            System.out.println("输入的月份有误");
        else
            this.month = month;
    }

    public int getMonth() {
        return this.month;
    }


}
