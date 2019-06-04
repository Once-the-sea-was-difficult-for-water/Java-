package com.lw.test;

public class ThreadStudy extends Thread{
  /*      //线程：在进程中独立运行的子任务
    public static void main(String[] args){
        System.out.println(Thread.currentThread().getName());
    }*/

    @Override
    public void run() {
        super.run();
        System.out.println("MyThread");
    }
}
