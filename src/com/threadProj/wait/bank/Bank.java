package com.threadProj.wait.bank;

public class Bank {
    private String account; // 账号
    private int balance; // 余额

    public Bank(String account, int balance) {
        this.account = account;
        this.balance = balance;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bank [" + "account=" + account + ", balance=" + balance + "]";
    }

    // 存款
    public synchronized void saveAccount() {
        // 可以再同的位置添加sleep方法
        int balance = getBalance();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        balance += 100;
        setBalance(balance);
        System.out.println("存款后的余额为：" + balance);
    }

    public synchronized void drawAccount() {
        int balance = getBalance();
        balance -= 200;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        setBalance(balance);
        System.out.println("取款后的余额为：" + balance);
    }
}
