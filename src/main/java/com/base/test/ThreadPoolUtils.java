package com.base.test;

import java.util.concurrent.*;

/**
 * <P></P>
 * Created by kevin on 2017/8/11 14:21.
 */
public class ThreadPoolUtils{
    /**
     *
     */
    private int corePoolSize;
    private int maximumPoolSize;
    private long keepAliveTime;
    private TimeUnit unit;
    private BlockingQueue<Runnable> workQueue;
    private ThreadFactory threadFactory;
    private RejectedExecutionHandler handler;

    private ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(corePoolSize,maximumPoolSize,keepAliveTime,unit, (BlockingQueue<Runnable>) workQueue,threadFactory,handler);
    public ThreadPoolExecutor getThreadPoolUtils(){
        return threadPoolExecutor;
    }
}
