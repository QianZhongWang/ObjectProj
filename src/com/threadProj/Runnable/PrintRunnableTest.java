package com.threadProj.Runnable;

public class PrintRunnableTest {
    public static void main(String[] args) {
        PrintRunnable pr = new PrintRunnable();
        Thread t1 = new Thread(pr, "线程1");
        Thread t2 = new Thread(pr, "线程2");
        t1.start();
        t2.start();
    }
}
