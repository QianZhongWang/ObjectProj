package com.threadProj.priority;

class Mythread extends Thread {
    private String name;

    public Mythread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + "线程正在运行..." + (i + 1) + "次");
        }
    }
}

public class PriorityDemo {
    public static void main(String[] args) {
        // 获取主线程的优先级
        int mainPriority = Thread.currentThread().getPriority();
        System.out.println("主线程的优先级为：" + mainPriority);
        Mythread mt1 = new Mythread("线程1");
        // 设置线程的优先级为10
        mt1.setPriority(Thread.MAX_PRIORITY);
        mt1.start();
        System.out.println("线程1的优先级为：" + mt1.getPriority());
    }
}
