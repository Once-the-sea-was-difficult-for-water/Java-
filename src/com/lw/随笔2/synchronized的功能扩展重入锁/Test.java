package com.lw.随笔2.synchronized的功能扩展重入锁;

import java.util.concurrent.locks.ReentrantLock;

public class Test implements Runnable {
    public static ReentrantLock lock = new ReentrantLock();
    public static int i = 0;
    @Override
    public void run() {
        lock.lock();
        lock.lock();
        try {
            i++;
            System.out.println("---"+i);
        }finally {
            lock.unlock();
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        Thread thread = new Thread(test);
        thread.start();
    }
}
