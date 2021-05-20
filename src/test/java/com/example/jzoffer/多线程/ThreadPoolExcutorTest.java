package com.example.jzoffer.多线程;

import org.springframework.scheduling.concurrent.DefaultManagedAwareThreadFactory;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: cola
 * @Created: cola on 2021/3/24 12:48
 * @Version 1.0
 */
public class ThreadPoolExcutorTest {

    public static void main(String[] args) {

        Hello2 hello2 = new Hello2();
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(
                10,
                20,
                30,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<Runnable>(100),
                new DefaultManagedAwareThreadFactory());

        for (int i = 0; i < 30; i++) {

            poolExecutor.execute(hello2);
        }
    }

}

class Hello2 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"");
    }
}
