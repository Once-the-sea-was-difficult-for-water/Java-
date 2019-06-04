package com.lw.实战java高并发程序设计.标记停止线程.线程中断;

public class InterruptDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(){
            @Override
            public void run() {
                Thread.yield();
                int i = 3;
                while (i>0){
                System.out.println("未中断");
                i--;
                }
            }
        };
        thread.start();
        Thread.sleep(100);
        thread.interrupt();

        Thread thread2 = new Thread(){
            @Override
            public void run() {
                while (true){
                    if (Thread.currentThread().isInterrupted()){
                        System.out.println("interrupt!");
                        break;
                    }else {
                        System.out.println("线程2未中断");
                    }
                    try {
                        Thread.sleep(2000);

                    }catch (InterruptedException e){
                        System.out.println("Interrupted When Sleep");
                        //设置中断状态
                        Thread.currentThread().interrupt();
                    }
                    Thread.yield();
                }
            }
        };
        thread2.start();
        Thread.sleep(20000);
        thread2.interrupt();
    }
}
