package com.threadProj.wait.queue;

public class Queue {
    private int n;

    private boolean flag = false; // 默认为false，表示没有数据

    public synchronized int getN() {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("消费n的值为：" + n);
        flag = false;
        notifyAll();
        return n;

    }

    public synchronized void setN(int n) {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("生产的n的值为：" + n);
        this.n = n;
        flag = true;
        notifyAll();
    }
}
