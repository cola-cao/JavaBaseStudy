package com.example.jzoffer;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import sun.nio.ch.ThreadPool;

import java.util.concurrent.*;

/**
 * Created on 2021/5/15.
 *
 * @author 曹可乐
 */

@Component
@ConfigurationProperties("thread.pool")
public class ThreadPoolProperties {
    int corePoolSize;
    int maximumPoolSize;
    long keepAliveTime;
    TimeUnit unit;
    BlockingQueue<Runnable> workQueue;
    ThreadFactory threadFactory;
    RejectedExecutionHandler handler;
}
