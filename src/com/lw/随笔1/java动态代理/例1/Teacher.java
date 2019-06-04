package com.lw.随笔1.java动态代理.例1;

public class Teacher implements People{

    @Override
    public String work() {
        System.out.println("老师教书育人。。。");

        return "教书";
    }
}
