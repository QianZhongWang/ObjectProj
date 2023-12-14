package com.inherit.work;

public class TestWork extends Work {
    private int testCasesNum;
    private int testCasesFailNum;

    public TestWork() {
    }

    public TestWork(int testCasesNum, int testCasesFailNum) {
        this.setTestCasesNum(testCasesNum);
        this.setTestCasesFailNum(testCasesFailNum);
    }

    public int getTestCasesNum() {
        return testCasesNum;
    }

    public void setTestCasesNum(int testCasesNum) {
        this.testCasesNum = testCasesNum;
    }

    public int getTestCasesFailNum() {
        return testCasesFailNum;
    }

    public void setTestCasesFailNum(int testCasesFailNum) {
        this.testCasesFailNum = testCasesFailNum;
    }

    public String introductionWork(){
        return "我是一名测试工程师，我的工作是" + this.getWorkName() + "，今天我执行了" + this.getTestCasesNum() + "个测试用例，其中有" + this.getTestCasesFailNum() + "个测试用例执行失败";
    }


}
