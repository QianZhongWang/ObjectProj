package com.threadProj.Runnable1;

public class PrintRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "线程正在运行..." + (i + 1) + "次");
        }
    }
}
