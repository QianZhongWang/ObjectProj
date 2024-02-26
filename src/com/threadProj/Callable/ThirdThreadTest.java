package com.threadProj.Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThirdThreadTest {
    public static void main(String[] args) {
        Callable<String> call = new ThirdThread();
        FutureTask<String> ft = new FutureTask<>(call);
        Thread t = new Thread(ft);

        t.start();

        try {
            System.out.println(ft.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
