package com.lw.随笔2.反射一;

import java.lang.reflect.Method;

public class 反射机制 {


        public static void main(String[] args) throws Exception{
            //获取类
            Class c = Class.forName(Demo.class.getName());
            //获取摸个特定方法
            //通过方法名和形参列表
            Method m = c.getDeclaredMethod("login",String.class,String.class);
            //通过反射机制执行login方法.

            Object o = c.newInstance();

            //调用o对象的m方法,传递"admin""123"参数，方法的执行结果是retValue

            Object retValue = m.invoke(o, "admin","123");

            System.out.println(retValue); //true
        }


}


