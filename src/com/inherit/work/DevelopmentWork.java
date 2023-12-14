package com.inherit.work;

public class DevelopmentWork extends Work {
    // 有效代码行数
    private int codeLinesNum;
    // 未解决的bug数
    private int bugNum;

    public DevelopmentWork() {
    }

    public DevelopmentWork(int codeLinesNum, int bugNum) {
        this.setCodeLinesNum(codeLinesNum);
        this.setBugNum(bugNum);
    }

    public int getCodeLinesNum() {
        return codeLinesNum;
    }

    public void setCodeLinesNum(int codeLinesNum) {
        this.codeLinesNum = codeLinesNum;
    }

    public int getBugNum() {
        return bugNum;
    }

    public void setBugNum(int bugNum) {
        this.bugNum = bugNum;
    }

    public String introductionWork() {
        return "我是一名开发工程师，我的工作是" + this.getWorkName() + "，今天我写了" + this.getCodeLinesNum() + "行代码，目前仍然有" + this.getBugNum() + "个bug没有解决";
    }
}
