package com.threadProj.thread1;

public class myThread extends Thread {
    public void run() {
        System.out.println(getName() + "Thread is running...");
    }
}
