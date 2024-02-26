package com.threadProj.Runnable;

public class PrintRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程正在运行...");
    }
}
