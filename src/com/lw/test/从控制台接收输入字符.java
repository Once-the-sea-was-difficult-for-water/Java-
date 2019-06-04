package com.lw.test;

import java.util.Scanner;

public class 从控制台接收输入字符 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("请输入你的身份证号");
        String line = scanner.nextLine();
        //打印对输入文本的描述
        System.out.println("原来你的身份证号是"+line+"；"+line.length()+"位数");
    }
}
