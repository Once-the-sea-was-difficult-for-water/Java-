package com.lw.thead;

public class ThreadInner {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        }).start();

        new Thread( () -> {System.out.println("hello1");} ).start();
        new Thread( () -> {System.out.println("123");}).start();
    }
}
