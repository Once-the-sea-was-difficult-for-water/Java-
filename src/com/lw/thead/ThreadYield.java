package com.lw.thead;
/**
 * yield()
 *     Thread的静态方法
 *     线程 从运行状态--到就绪状态
 *     线程在 this.start()准备执行——就绪状态 ，run()运行——就是运行状态
 */
public class ThreadYield extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println(this.getName() + "  " + i);
            // 当i为30时，该线程就会把CPU时间让掉，让其他或者自己的线程执行（也就是谁先抢到谁执行）
            if (i == 30) {
                this.yield();
            }
        }
    }

    public static void main(String[] args) {
        ThreadYield yt1 = new ThreadYield();
        ThreadYield yt2 = new ThreadYield();
        yt1.start();
        yt2.start();
    }
}
