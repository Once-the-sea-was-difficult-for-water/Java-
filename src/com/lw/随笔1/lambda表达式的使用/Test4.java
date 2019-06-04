package com.lw.随笔1.lambda表达式的使用;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test4 {
    public static void main(String[] args) {
        String[] players = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka", "David Ferrer",
                "Roger Federer", "Andy Murray",
                "Tomas Berdych", "Juan Martin Del Potro",
                "Richard Gasquet", "John Isner"};
        //使用匿名内部类根据 name排序players
        Arrays.sort(players, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2.compareTo(o1));
            }
        });
        System.out.println(players[0]);

        System.out.println("------------------------>>>>>>>");
        Comparator<String> sortByName = (String s1,String s2) -> (s1.compareTo(s2));
        Arrays.sort(players,sortByName);
        List<String> player = Arrays.stream(players).collect(Collectors.toList());
        player.forEach(System.out::println);
        player.forEach((pl) -> System.out.println(pl+";"));
    }
}
