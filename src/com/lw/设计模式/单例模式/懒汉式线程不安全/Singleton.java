package com.lw.设计模式.单例模式.懒汉式线程不安全;

public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton(){}
    public static Singleton getUniqueInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
