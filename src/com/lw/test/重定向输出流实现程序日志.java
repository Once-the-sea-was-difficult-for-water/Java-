package com.lw.test;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class 重定向输出流实现程序日志 {
    public static void main(String[] args) {
        try {
            PrintStream out = System.out;
            PrintStream ps = new PrintStream("./log.txt");
            System.setOut(ps);
            String message = "重定向输出流";
            System.out.println(message);
            System.setOut(out);
            System.out.println("已经结束");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
