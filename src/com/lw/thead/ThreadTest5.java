package com.lw.thead;

import static java.lang.Thread.sleep;

/**
 * 验证volatile不具备原子性
 * COUNT++不具备原子性 COUNT从主内存复制然后+1 在执行+1这个操作的时候主内又被复制出去了一份 导致COUNT没有保证原子性
 */
public class ThreadTest5 {
    private static volatile    Integer COUNT = 0;
    public synchronized static void add(){
        COUNT++;
    }
    public static void main(String[] args)  {
        for (int i = 0; i < 100; i++) {
                new  Thread(new Runnable() {
                    @Override
                    public  void run() {
                        try {
                            sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        add();
                    }
                }).start();

        }
        try {
            sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(COUNT);
    }
}
