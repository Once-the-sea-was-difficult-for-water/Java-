package com.lw.thead;

public class ThreadWait {
    public static void main(String[] args) {
        ThreadWait threadWait = new ThreadWait();
        synchronized (threadWait){
            System.out.println(Thread.currentThread().getName());
            try {
                threadWait.wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
