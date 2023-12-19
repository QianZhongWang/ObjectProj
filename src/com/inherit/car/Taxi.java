package com.inherit.car;

public class Taxi extends Car {
    // 私有属性：所属公司(Company)
    private String company;

    // 调用父类的方法完成属性的赋值
    public Taxi() {
        super();
    }

    public Taxi(String color, String userName, String company) {
        super(color, userName);
        this.setCompany(company);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    // 创建不允许重写的方法ride，描述为**出租车是所属在**公司的
    public final void ride() {
        System.out.println(this.getUserName() + "的出租车是所属于" + this.getCompany() + "公司的");
    }

    @Override
    public void use() {
        System.out.println("出租车是提高市民生活质量的重要条件之一");
    }

    @Override
    public String toString() {
        return "出租车的信息是：" + this.getUserName() + "拥有一辆" + this.getColor() + "的出租车";
    }
}
