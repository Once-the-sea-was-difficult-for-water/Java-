package com.lw.随笔1.lambda表达式的使用;

public class Test3 {
    public static void main(String[] args) {
        //使用匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world!");
            }
        });
        //使用lambda
        new Thread(() -> System.out.println("Hello world!"));
        //使用匿名内部类
        Runnable race1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world!");
            }
        };
        //使用lambda
        Runnable race2 = () -> System.out.println("Hello world!");
        race1.run();
        race2.run();

    }
}
