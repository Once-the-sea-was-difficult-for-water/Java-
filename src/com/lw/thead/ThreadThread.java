package com.lw.thead;

public class ThreadThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.printf("hello");
    }

    public static void main(String[] args) {
        ThreadThread thread = new ThreadThread();
        thread.start();
    }
}
