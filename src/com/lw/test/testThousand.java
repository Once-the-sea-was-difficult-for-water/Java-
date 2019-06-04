package com.lw.test;

import java.util.ArrayList;
import java.util.List;

public class testThousand {
    public static void main(String[] args){
        System.out.println("去空操作------------------->>");
        String str = "china : Goods";
        StringBuffer toEmpty = new StringBuffer();
        for (int i=0;i<str.length();i++){
            char charAt = str.charAt(i);
            if (charAt==' ')
                continue;
            toEmpty.append(charAt);
        }
        System.out.println("---去空操作》》"+toEmpty);

        System.out.println("两变量互换-------------------->>>");/*
        (1) 0^0=0,   0^1=1   0与任何数异或＝任何数
                (2) 1^0=1,   1^1=0   1与任何数异或 =任何数取反
                (3) 任何数异或自己＝把自己置0*/
        int a = 6;
        int b = 8;
        a = a^b;
        b = b^a;
        a = b^a;
        System.out.println("变量互换---------》》a="+a+">>b="+b);
        int A = 8;
        int B = 8;
        System.out.println("判断变量是否相等-----》》"+(A^B));


        System.out.println("------------->>>二维数组");
        int[][] test = new int[8][8];
        test[1][1] =1;
        System.out.println("--二维>>"+test[1].length);

        System.out.println("--------->>foreach与for foreach是for的简写格式 foreach优于for《《《  src=foreach.png");

        List<String> testfor = new ArrayList<String>();
        testfor.add("test1");
        testfor.add("test2");
        testfor.add("test3");
        for (String tf:testfor) {
            System.out.println("---foreach>>>"+tf);
        }

        System.out.println("---------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------");
        System.out.println("《循环的极限》");
        int end = Integer.MAX_VALUE;
        System.out.println("----int最大值》》"+end);
        int endTest = end+1;
        System.out.println("----int》》》"+endTest);
        int start = endTest-50;
        int count = 0;
        /*for (int i=start;i<=end;i++){//无限循环
            count++;
        }*/
        System.out.println("---->>>"+count);
    }
}
