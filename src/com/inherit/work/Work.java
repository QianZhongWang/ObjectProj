package com.inherit.work;
public class Work {
    // private : 私有的，只能在本类中访问
    // default : 默认的，只能在本类和同包中访问
    // protected : 受保护的，只能在本类和子类中访问
    // public : 公共的，任何地方都可以访问

    private String workName;

    public Work() {
    }

    public Work(String workName) {
        this.workName = workName;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public String introductionWork() {
        return "我是一名普通员工，我的工作是" + this.getWorkName();
    }
}
