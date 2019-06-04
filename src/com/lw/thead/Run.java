package com.lw.thead;

public class Run {
    public static void main(String[] args){
        /*MyThread myThread = new MyThread();
        myThread.start();*/
        /*MyThread myThread = new MyThread();
        Thread a = new Thread(myThread);
        Thread b = new Thread(myThread);
        Thread c = new Thread(myThread);
        Thread d = new Thread(myThread);*/
        Thread a = new MyThread();
        Thread b = new MyThread();
        Thread c = new MyThread();
        Thread d = new MyThread();
        a.start();
        b.start();
        c.start();
        d.start();
        System.out.println("运行结束！");
    }
}
