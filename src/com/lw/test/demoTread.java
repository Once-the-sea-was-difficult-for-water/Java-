package com.lw.test;

public class demoTread {
    public  volatile static int count = 0;
    public  static void inc(){
        //延迟一毫秒
     try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
    }
    public static void main(String[] args){
        for(int i=0;i<1000;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                        demoTread.inc();
                }
            }).start();
        }
        System.out.println("运行结果："+demoTread.count);
    }
}
