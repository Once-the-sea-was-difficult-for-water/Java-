package com.lw.thead;

public class MyThread extends Thread {
    private int count = 5;
    @Override
    public  void run() {
        super.run();
        count--;
        System.out.println("MyThread------->>>>"+count);
    }
}
