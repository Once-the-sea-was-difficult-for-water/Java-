package com.lw.随笔1.lambda表达式的使用;

import java.util.Arrays;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        String[] atp = {"a","b","c","d","e","f","g"};
        List<String> players = Arrays.asList(atp);
        System.out.println("------------------------->>以前的");
        //以前的循环
        for(String player:players){
            System.out.println(player+";");
        }
        System.out.println("-------------------------->>现在的");
        players.forEach((player) -> System.out.println(player + ";"));

        //在 java 8 中使用双冒号操作符
        players.forEach(System.out::println);
    }
}
