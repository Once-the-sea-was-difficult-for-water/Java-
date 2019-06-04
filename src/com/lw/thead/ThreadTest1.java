package com.lw.thead;
/**
 * sleep()和wait()区别
 *      1、wait()等待释放锁
 *      2、sleep()等待不释放锁
 */
public class ThreadTest1 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " run ");
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadTest1 V2_6 = new ThreadTest1();
        synchronized(V2_6) {
            try {
                System.out.println(Thread.currentThread().getName()+" start t1");
                V2_6.start(); //开启和注释验证
                System.out.println(Thread.currentThread().getName()+" wait()");
                V2_6.wait();
                System.out.println(Thread.currentThread().getName()+" continue");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
