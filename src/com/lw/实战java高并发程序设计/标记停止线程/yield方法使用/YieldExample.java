package com.lw.实战java高并发程序设计.标记停止线程.yield方法使用;

public class YieldExample {
    public static void main(String[] args) {
        Producer producer = new Producer();
        Consumer consumer = new Consumer();
        //设置线程优先级
        producer.setPriority(Thread.MIN_PRIORITY);
        consumer.setPriority(Thread.MAX_PRIORITY);
        producer.start();
        consumer.start();
    }
    static class Producer extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 5; i++){
                System.out.println("Producer:"+i);
                Thread.yield();
            }
        }
    }
    static class Consumer extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 5; i++){
                System.out.println("Consumer:"+i);
                Thread.yield();
            }
        }
    }
}
