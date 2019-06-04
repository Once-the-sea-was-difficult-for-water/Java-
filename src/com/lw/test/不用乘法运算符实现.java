package com.lw.test;

import java.util.Scanner;

public class 不用乘法运算符实现 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("这是一个整数");
        long number = scanner.nextLong();
        System.out.println("乘以16结果为"+(number<<4));
    }

}
