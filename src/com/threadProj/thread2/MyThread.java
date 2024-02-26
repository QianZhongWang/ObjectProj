package com.threadProj.thread2;

public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "Thread is running..." + (i + 1));
        }
    }
}
