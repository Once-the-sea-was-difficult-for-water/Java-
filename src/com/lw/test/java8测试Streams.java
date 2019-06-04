package com.lw.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class java8测试Streams {
    public static void main(String[] args) {
        List<Integer> transactions  = new ArrayList<>();
        transactions.add(66);
        transactions.add(6);
        transactions.add(88);
        transactions.add(8);
        transactions.add(9);
        transactions.add(99);
        List<Integer> transactionIds = transactions.stream().filter( i -> i>10).sorted().collect(Collectors.toList());
        System.out.println("------>>>"+transactionIds.toString());
        List<String> streamTest = new ArrayList<>();
        streamTest.add("aaa");
        streamTest.add("bbb");
        streamTest.add("");
        streamTest.add("ccc");
        streamTest.add("");
        streamTest.add("ddd");
        String stringResult = streamTest.stream().filter(j -> !j.isEmpty()).sorted().collect(Collectors.joining(";"));
        System.out.println("----->>>"+stringResult);
    }

}
