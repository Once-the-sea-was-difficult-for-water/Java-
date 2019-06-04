package com.lw.随笔2.公平锁;

import java.util.concurrent.locks.ReentrantLock;

public class FairLock implements Runnable{
    //true时为公平锁
    public static ReentrantLock fairLock = new ReentrantLock(true);
    @Override
    public void run() {
        while (true){
            try {
                fairLock.lock();
                System.out.println(Thread.currentThread().getId()+"获得锁");
            }finally {
                fairLock.unlock();
            }
        }
    }
    public static void main(String[] args){
        FairLock r1 = new FairLock();
        Thread t1 = new Thread(r1,"Thread_t1");
        Thread t2 = new Thread(r1,"Thread_t2");
        t1.start();t2.start();
    }
}
