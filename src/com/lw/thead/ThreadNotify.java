package com.lw.thead;

import java.util.concurrent.atomic.AtomicBoolean;

public class ThreadNotify extends Thread{
    private static AtomicBoolean BOOLEAN = new AtomicBoolean(true);
    private String test;
    public void run() {
        synchronized (BOOLEAN){
            if(BOOLEAN.get()){
                try {
                    System.out.printf("执行");BOOLEAN.set(false);
                    System.out.println("wait start"+test);
                    BOOLEAN.wait();
                    System.out.println("wait end"+test);
                } catch (InterruptedException e) {

                }
            }else {
                System.out.println("notify start"+test);
                BOOLEAN.notify();
                System.out.println("notify end"+test);
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
        ThreadNotify v2_2 = new ThreadNotify();
        ThreadNotify v2_3 = new ThreadNotify();
        v2_2.test = "v2_2";
        v2_3.test = "v2_3";
        v2_2.start();
        v2_3.start();

    }

}
