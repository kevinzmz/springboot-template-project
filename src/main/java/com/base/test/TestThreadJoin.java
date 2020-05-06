package com.base.test;

/**
 * @auther kevin
 * @date 2020/5/6 15:14
 */
public class TestThreadJoin {

    public static class ThreadOne implements Runnable{

        @Override
        public void run() {
            try {
                System.out.println("---------------- one begin sleep ----------------------");
                try{
                    Thread.sleep(100000000);
                }catch(InterruptedException e){
                    System.out.println("------------------------ 当前线程被唤醒 ------------------");
                }
                System.out.println("---------------- one end sleep ------------------------");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static class ThreadTwo implements Runnable{
        private Thread test;
        public ThreadTwo(Thread test){
            this.test = test;
        }

        @Override
        public void run() {
            try {
                System.out.println("--------- 等待销毁中 ---------------------" + test.isInterrupted());
                test.join();
                System.out.println("--------------- 销毁完成 -------------------");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class ThreadThree implements Runnable{
        private Thread temp;
        public ThreadThree (Thread temp){
            this.temp = temp;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("---------------- 开始中断 ----------------------"+temp.getState());
            temp.interrupt();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("---------------中断状态-----------------------" + temp.isInterrupted());
        }
    }

    public static void main(String[] args) {
        Thread one = new Thread(new ThreadOne());
        one.start();

        Thread three = new Thread(new ThreadThree(one));
        three.start();

        Thread two = new Thread(new ThreadTwo(one));
        two.start();
    }

}
