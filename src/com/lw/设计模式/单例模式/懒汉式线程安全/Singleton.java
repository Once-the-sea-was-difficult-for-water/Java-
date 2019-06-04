package com.lw.设计模式.单例模式.懒汉式线程安全;

public class Singleton {
    private static Singleton uniqueSingleton;
    public static synchronized Singleton getUniqueSingleton(){
        if (uniqueSingleton == null){
            uniqueSingleton = new Singleton();
        }
        return uniqueSingleton;
    }
}
