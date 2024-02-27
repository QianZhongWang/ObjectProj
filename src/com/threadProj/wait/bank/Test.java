package com.threadProj.wait.bank;

public class Test {
    public static void main(String[] args) {
        // 创建一个银行账户
        Bank bank = new Bank("1001", 1000);
        // 创建线程对象
        SaveAccount saveAccount = new SaveAccount(bank);
        DrawAccount drawAccount = new DrawAccount(bank);
        // 创建线程
        Thread save = new Thread(saveAccount);
        Thread draw = new Thread(drawAccount);
        // 启动线程
        save.start();
        draw.start();

        try {
            save.join();
            draw.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("账户余额为：" + bank);



    }
}
