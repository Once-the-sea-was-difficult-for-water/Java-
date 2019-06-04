package com.lw.thead;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadSleep {
    private  static final SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss SSS");
    public static void main(String[] args) {
        System.out.printf(sf.format(new Date()));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf(sf.format(new Date()));
    }
}
