package com.threadProj.thread1;

public class myThreadTest {
    public static void main(String[] args) {
        myThread t1 = new myThread();
        myThread t2 = new myThread();
        t1.start();
        t2.start();
    }
}
