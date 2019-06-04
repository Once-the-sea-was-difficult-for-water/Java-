package com.lw.随笔2.重入锁的搭档Condition;

public class 重入锁的搭档Condition {
    //await()方法回事当前线程等待，同时释放当前锁，当其他线程中使用signal()或者signalAll()方法时，线程会重新获得锁并继续执行。
    //或者当前线程被中断时，也能跳出等待。这和Object.wait()方法类似。

    //awaitUninterruptibly()方法与await()方法基本相同，但是它不会在等待过程中响应中断。

    //singal()方法用于唤醒一个在等待中的线程。相对的sinagalAll()方法会唤醒所有在等待中的线程。这和Object.notify()方法类似。
}
