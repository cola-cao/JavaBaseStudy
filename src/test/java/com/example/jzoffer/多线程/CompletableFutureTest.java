package com.example.jzoffer.多线程;

import java.util.concurrent.*;

/**
 * Created on 2021/5/15.
 *
 * @author 曹可乐
 */
public class CompletableFutureTest {

    public static ThreadPoolExecutor executor = new ThreadPoolExecutor(
            10,
            30,
            20,
            TimeUnit.MICROSECONDS,
            new LinkedBlockingDeque<Runnable>(100),
            new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) {

        //使用异步编排
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
            }
            System.out.println("run end ...");
        },executor);
    }

}
