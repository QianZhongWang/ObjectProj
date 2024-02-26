package com.threadProj.Callable;

import java.util.concurrent.Callable;

public class ThirdThread implements Callable<String> {
    @Override
    public String call() throws Exception {

        // 方法类型可以根据要返回值的类型进行确认
        return "多线程的第三种实现方式";
    }
}
