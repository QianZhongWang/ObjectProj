package com.threadProj.wait.bank;

public class DrawAccount implements Runnable{
    Bank bank;
    public DrawAccount(Bank bank){
        this.bank = bank;
    }

    @Override
    public void run() {
        bank.drawAccount();
    }
}
