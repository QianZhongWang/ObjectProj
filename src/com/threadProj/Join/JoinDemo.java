package com.threadProj.Join;

class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i= 0; i < 20; i++){

            System.out.println(Thread.currentThread().getName() + "线程正在运行..."+(i + 1) + "次");
        }
    }
}

public class JoinDemo {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t1 = new Thread(mt, "线程1");
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 20; i++){
            System.out.println("主线程运行..."+(i + 1) + "次");
        }
        System.out.println("主线程运行结束...");
    }
}
