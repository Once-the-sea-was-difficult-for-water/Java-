package com.lw.thead;

public class ThreadRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadRunnable());
        thread.start();
    }
}
