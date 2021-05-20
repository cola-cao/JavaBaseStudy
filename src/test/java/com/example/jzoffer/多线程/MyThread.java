package com.example.jzoffer.多线程;

/**
 * @Author: cola
 * @Created: cola on 2021/3/11 21:49
 * @Version 1.0
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {

            if (i % 2 == 0)
                System.out.println("i="+i);
        }
    }
}

class ThreadTest {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();

        //myThread.run();
        myThread.start();

    }
}
