package com.singletonProj.Singleton;

public class Emperor {
    private Emperor() {
        System.out.println("皇帝诞生！");
    }
    private static Emperor instance = null;

    public static Emperor getInstance(){
        if(instance == null){
            instance = new Emperor();
        }
        return instance;
    }
}
