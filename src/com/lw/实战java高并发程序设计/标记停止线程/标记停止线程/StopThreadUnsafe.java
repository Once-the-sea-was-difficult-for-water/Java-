package com.lw.实战java高并发程序设计.标记停止线程.标记停止线程;

import jdk.nashorn.internal.objects.annotations.Where;

public class StopThreadUnsafe extends Thread{
    /*
    如果一个类要被声明为static的，只有一种情况，就是静态内部类。如果外部类声明为static，无法编译
        1、静态内部类跟静态方法一样，只能访问静态的成员变量和方法，不能访问非静态的方法和属性，但是普通内部类可以访问任意外部类的成员变量和方法。
        2、静态内部类可以声明普通的成员变量和方法，而普通内部类不能声明static成员变量和方法
        3、静态内部类可以单独初始化
     静态内部类的使用场景一般是当外部类需要使用内部类，而内部类无需使用外部资源，并且内部类可以单独创建的时候会考虑采用静态内部类的设计。
     */
    public static User u = new User();
    public static class User{
        private int id;
        private String name;
        public User(){
            id = 0;
            name = "0";
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
/*    public static class ChangeObjectThread extends Thread{
        @Override
        public void run() {
            while (true){
                synchronized (u){
                    int v = (int) (System.currentTimeMillis()/1000);
                    u.setId(v);
                    try {
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    u.setName(String.valueOf(v));
                }
                Thread.yield();
            }
        }
    }*/
    public static class ChangeObjectThread extends Thread{
        volatile boolean stopme = false;
        public void stopMe(){
            stopme = true;
        }
        @Override
        public void run() {
            while (true){
                if (stopme){
                    System.out.println("exit by stop me");
                    break;
                }
                synchronized (u){
                    int v = (int) (System.currentTimeMillis()/1000);
                    u.setId(v);
                    try {
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    u.setName(String.valueOf(v));
                }
                Thread.yield();
            }
        }
    }
    public static class ReadObjectThread extends Thread{
        @Override
        public void run() {
            while (true){
                synchronized (u){
                    if (u.getId() != Integer.parseInt(u.getName())){
                        System.out.println(u.toString());
                    }
                }
                Thread.yield();
            }
        }
    }
    public static void main(String[] args) throws InterruptedException{
        new ReadObjectThread().start();
        while (true){
            Thread t = new ChangeObjectThread();
            t.start();
            Thread.sleep(150);
            ((ChangeObjectThread) t).stopMe();
        }
    }
   /* volatile boolean stopme = false;

    public void stopMe(){
        stopme = true;
    }*/

}
