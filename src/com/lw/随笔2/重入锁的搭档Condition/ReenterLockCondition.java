package com.lw.随笔2.重入锁的搭档Condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReenterLockCondition implements Runnable{
    public static ReentrantLock lock = new ReentrantLock();
    public static Condition condition = lock.newCondition();
    @Override
    public void run() {
        try {
            lock.lock();
            condition.await();
            System.out.println("Thread is going on");
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        ReenterLockCondition t = new ReenterLockCondition();
        Thread t1 = new Thread(t);
        t1.start();
        Thread.sleep(2000);
        //通知线程t1继续执行
        lock.lock();
        condition.signal();
        lock.unlock();
    }
}
