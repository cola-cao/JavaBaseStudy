package com.example.jzoffer.JUC.可重入锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created on 2021/6/7.
 *
 * @author 曹可乐
 */
public class Kechongru {
    Lock lock = new ReentrantLock();
    public synchronized void get(){
        System.out.println(Thread.currentThread().getName()+"\t 运行了get()");
        post();
    }

    public synchronized void post(){
        System.out.println(Thread.currentThread().getName()+"\t 运行了post()");
    }

    public static void main(String[] args) throws InterruptedException {
        Kechongru kechongru = new Kechongru();

        System.out.println("验证synchronized：");

        for (int i = 0; i < 10; i++) {
            new Thread(()->{

                kechongru.get();

            },"t1").start();
        }


//        new Thread(()->{
//            kechongru.get();
//        },"t2").start();
    }
}
