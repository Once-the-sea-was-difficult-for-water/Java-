package com.lw.随笔2.反射二;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) throws Exception {
        //User类还没有加载，在源文件阶段就能够获取字节码文件
        Class test1 = Class.forName(User.class.getName());
        //通过无参构造函数来创建对象
        User user = (User) test1.newInstance();
        System.out.println("One------->>"+user.distributeOne);

        //获取指定的构造方法
        Class test2 = Class.forName("com.lw.随笔2.反射二.User");
        //先获取参数构造器
        Constructor constructor = test2.getConstructor(String.class,String.class,String.class);
        //通过构造器实例化对象，将参数传进去
        User user2 = (User) constructor.newInstance("1","12","小明");
        System.out.println("Two------>>"+user2.toString());

        System.out.println("Three------>>>>>>>>>>>>>>>");
        Class test3 = Class.forName(User.class.getName());
        //获取所有构造方法
        Constructor[] constructors = test3.getConstructors();
        //遍历所有构造方法
        for (int i = 0; i < constructors.length; i++){
            Class[] parameter  = constructors[i].getParameterTypes();
            System.out.println("第"+i+"个构造函数");
            for (int j = 0; j < parameter.length; j++){
                System.out.println(parameter[j].getName()+",");
            }
        }

        System.out.println("Four------>>>>>>>>>>>>");
        //获取字节码文件
        Class test4 = Class.forName(User.class.getName());
        //获取实例对象
        User user4 = (User) test4.newInstance();
        Field field = test4.getDeclaredField("id");
        field.setAccessible(true);
        field.set(user4, "2");
        System.out.println(field.get(user4));

        System.out.println("Five------->>>>>>>");
        Class test5 = user.getClass();
        User user1 = new User("1","张三","李四");
        Method method = test5.getMethod("toString");
        System.out.println(method.invoke(user1));


    }
}
