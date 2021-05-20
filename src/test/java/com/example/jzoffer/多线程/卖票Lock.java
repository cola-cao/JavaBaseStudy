package com.example.jzoffer.多线程;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: cola
 * @Created: cola on 2021/3/12 18:26
 * @Version 1.0
 */
public class 卖票Lock {

    public static void main(String[] args) {

        Window window = new Window();
        Window window1 = new Window();
        Window window2 = new Window();

        window.setName("线程三");
        window1.setName("线程四");
        window2.setName("线程五");

        window.start();
        window1.start();
        window2.start();

    }
}

class Window extends Thread{

    private static int  ticket = 100;

    private static ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {

        while (true){
            try{

                lock.lock();

                if (ticket > 0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "=:" + ticket--);
                }

                if (ticket <= 0){
                    return;
                }

            }finally {
                lock.unlock();
            }
        }
    }
}
