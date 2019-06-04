package com.lw.实战java高并发程序设计.标记停止线程.Volatile与java内存模型JMM;

public class PlusTask {

    private static volatile int i=0;
    public static class PlusTaskTask implements Runnable{

        @Override
        public void run() {
            for (int k=0; k<10000; k++)
                i++;
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread[] thread = new Thread[10];
        for (int i=0; i<10; i++){
            thread[i] = new Thread(new PlusTaskTask());
            thread[i].start();
        }
        for (int i=0; i<10; i++){
            thread[i].join();
        }
        System.out.println(i);
        int a = 0;
        double b = 1.0;
        System.out.println(a>b);
    }
}
