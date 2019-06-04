package com.lw.实战java高并发程序设计.标记停止线程.守护线程;

public class DaemonThread {
    public static class DaemonT extends Thread{
        @Override
        public void run() {
            while (true){
                System.out.println("I have alive");
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new DaemonT();
        //设置守护线程,需要在线程start之前
        t.setDaemon(true);
        t.start();
        Thread.sleep(2000);
    }
}
