package com.inherit.work;

public class Work {
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
