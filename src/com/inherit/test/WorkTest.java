package com.inherit.test;

import com.inherit.work.DevelopmentWork;
import com.inherit.work.TestWork;
import com.inherit.work.Work;

public class WorkTest {
    public static void main(String[] args) {
        Work work = new Work();
        System.out.println(work.introductionWork());

        TestWork testWork = new TestWork(10, 5);
        testWork.setWorkName("测试工作");
        System.out.println(testWork.introductionWork());

        DevelopmentWork developmentWork = new DevelopmentWork(1000, 10);
        developmentWork.setWorkName("开发工作");
        System.out.println(developmentWork.introductionWork());


    }
}
