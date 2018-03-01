package com.base.test;

import com.base.utils.DateUtils;

import java.util.*;
import java.util.concurrent.*;

/**
 * <p>测试concurrent包相关方法</p>
 *
 * @author kevin
 * @create 2018-02-28 17:32
 **/
public class TestConcurrent {
    private static ExecutorService executorService = Executors.newFixedThreadPool(5);

    private CyclicBarrier cyclicBarrier = new CyclicBarrier(3);

    public void testExecutorService() throws InterruptedException {
        List<Callable<Object>> list= new ArrayList<Callable<Object>>();

        list.add(new Callable<Object>() {
            @Override
            public String call() throws Exception {
                System.out.println("Task " + Thread.currentThread().getId() + ":  begin " + DateUtils.y_M_d_H_m_s_S.getFormatDate(new Date()));
                try {
                    Thread.sleep(2000);
                    System.out.println("Task " + Thread.currentThread().getId() + ":  begin after sleep " + DateUtils.y_M_d_H_m_s_S.getFormatDate(new Date())+ " 到达cyclicBarrier");
                    cyclicBarrier.await();
                    System.out.println("Task " + Thread.currentThread().getId() + ":  after arrived begin " + DateUtils.y_M_d_H_m_s_S.getFormatDate(new Date()));
                    Thread.sleep(2000);
                    System.out.println("Task " + Thread.currentThread().getId() + ":  after arrived begin sleep " + DateUtils.y_M_d_H_m_s_S.getFormatDate(new Date())+ " 睡眠2秒");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
                return String.valueOf(Thread.currentThread().getId());
            }
        });

        list.add(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                System.out.println("Task " + Thread.currentThread().getId() + ":  begin " + DateUtils.y_M_d_H_m_s_S.getFormatDate(new Date()));
                try {
                    Thread.sleep(4000);
                    System.out.println("Task " + Thread.currentThread().getId() + ":  begin after sleep " + DateUtils.y_M_d_H_m_s_S.getFormatDate(new Date())+ " 到达cyclicBarrier");
                    cyclicBarrier.await();
                    System.out.println("Task " + Thread.currentThread().getId() + ":  after arrived begin " + DateUtils.y_M_d_H_m_s_S.getFormatDate(new Date()));
                    Thread.sleep(4000);
                    System.out.println("Task " + Thread.currentThread().getId() + ":  after arrived begin sleep " + DateUtils.y_M_d_H_m_s_S.getFormatDate(new Date())+ " 睡眠4秒");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
                return String.valueOf(Thread.currentThread().getId());
            }
        });

        list.add(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                System.out.println("Task " + Thread.currentThread().getId() + ":  begin " + DateUtils.y_M_d_H_m_s_S.getFormatDate(new Date()));
                try {
                    Thread.sleep(6000);
                    System.out.println("Task " + Thread.currentThread().getId() + ":  begin after sleep " + DateUtils.y_M_d_H_m_s_S.getFormatDate(new Date()) + " 到达cyclicBarrier");
                    cyclicBarrier.await();
                    System.out.println("Task " + Thread.currentThread().getId() + ":  after arrived begin " + DateUtils.y_M_d_H_m_s_S.getFormatDate(new Date()));
                    Thread.sleep(6000);
                    System.out.println("Task " + Thread.currentThread().getId() + ":  after arrived begin sleep " + DateUtils.y_M_d_H_m_s_S.getFormatDate(new Date()) + " 睡眠6秒");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
                return String.valueOf(Thread.currentThread().getId());
            }
        });

        List<Future<Object>> futures = executorService.invokeAll(list);

        executorService.shutdown();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestConcurrent testConcurrent = new TestConcurrent();
        testConcurrent.testExecutorService();
    }
}
