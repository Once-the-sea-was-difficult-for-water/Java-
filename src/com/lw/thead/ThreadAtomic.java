package com.lw.thead;

import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Thread.sleep;

/**
 * AtomicInteger
 *      原子性变量
 */
public class ThreadAtomic extends Thread{
    private static AtomicInteger atomicInteger = new AtomicInteger(0);

    public static void main(String[] args)  {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    atomicInteger.incrementAndGet();
                }
            }).start();
        }
        try {
            sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(atomicInteger);
    }
}
