package com.lw.随笔1.Streams使用;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Test1 {
    public static void main(String[] args) {
        List<Person> javaProgrammers = new ArrayList<Person>() {
            {
                add(new Person("Elsdon", "Jaycob", "Java programmer", "male", 43, new BigDecimal(2000)));
                add(new Person("Tamsen", "Brittany", "Java programmer", "female", 23, new BigDecimal(1500)));
                add(new Person("Floyd", "Donny", "Java programmer", "male", 33, new BigDecimal(1800)));
                add(new Person("Sindy", "Jonie", "Java programmer", "female", 32, new BigDecimal(1600)));
                add(new Person("Vere", "Hervey", "Java programmer", "male", 22, new BigDecimal(1200)));
                add(new Person("Maude", "Jaimie", "Java programmer", "female", 27, new BigDecimal(1900)));
                add(new Person("Shawn", "Randall", "Java programmer", "male", 30, new BigDecimal(2300)));
                add(new Person("Jayden", "Corrina", "Java programmer", "female", 35, new BigDecimal(1700)));
                add(new Person("Palmer", "Dene", "Java programmer", "male", 33, new BigDecimal(2000)));
                add(new Person("Addison", "Pam", "Java programmer", "female", 34, new BigDecimal(1300)));
            }
        };

        List<Person> phpProgrammers = new ArrayList<Person>() {
            {
                add(new Person("Jarrod", "Pace", "PHP programmer", "male", 34, new BigDecimal(1550)));
                add(new Person("Clarette", "Cicely", "PHP programmer", "female", 23, new BigDecimal(1200)));
                add(new Person("Victor", "Channing", "PHP programmer", "male", 32, new BigDecimal(1600)));
                add(new Person("Tori", "Sheryl", "PHP programmer", "female", 21, new BigDecimal(1000)));
                add(new Person("Osborne", "Shad", "PHP programmer", "male", 32, new BigDecimal(1100)));
                add(new Person("Rosalind", "Layla", "PHP programmer", "female", 25, new BigDecimal(1300)));
                add(new Person("Fraser", "Hewie", "PHP programmer", "male", 36, new BigDecimal(1100)));
                add(new Person("Quinn", "Tamara", "PHP programmer", "female", 21, new BigDecimal(1000)));
                add(new Person("Alvin", "Lance", "PHP programmer", "male", 38, new BigDecimal(1600)));
                add(new Person("Evonne", "Shari", "PHP programmer", "female", 40, new BigDecimal(1800)));
            }
        };
        System.out.println("--->>>所有程序员的名字");
        javaProgrammers.forEach((java) -> System.out.printf("%s %s; ",java.getFirstName(),java.getFirstName()));
        phpProgrammers.forEach((php) -> System.out.printf("%s %s; ",php.getFirstName(),php.getLastName()));
        System.out.println();
        System.out.println("--->>>给程序员加薪 5% ：");
        List<Person> javaProgrammersAdd = new ArrayList<Person>();
        javaProgrammersAdd.addAll(javaProgrammers);
        Consumer<Person> giveRaise = e -> e.setSalary(e.getSalary().multiply(new BigDecimal(0.5)).add(e.getSalary()));
        javaProgrammersAdd.forEach(giveRaise);
        phpProgrammers.forEach(giveRaise);
        javaProgrammers.forEach((java) -> System.out.println(java.getSalary()));
        System.out.println("------");
        javaProgrammersAdd.forEach((java) -> System.out.println(java.getSalary()));



    }
}
