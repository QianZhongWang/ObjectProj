package com.collection.hashSet.animal;

public class Cat {
    private String name;
    private int month;
    private String species;

    public Cat() {
    }

    public Cat(String name, int month, String species) {
        this.setName(name);
        this.setMonth(month);
        this.setSpecies(species);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "[名字：" + this.getName() + "，年龄: " + this.getMonth() + "，品种: " + this.getSpecies() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        //判断对象是否相等，相等则返回true
        if (this == obj) return true;
        // 判断obj是否是Cat类的对象
        System.out.println("obj的class"+obj.getClass());
        System.out.println("Cat对象的class"+Cat.class);
        if (obj.getClass() == Cat.class) {
            Cat cat = (Cat) obj;
            return cat.getName().equals(this.getName()) && cat.getMonth() == this.getMonth() && cat.getSpecies().equals(this.getSpecies());
        }
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + month;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((species == null) ? 0 : species.hashCode());
        return result;
    }
}
