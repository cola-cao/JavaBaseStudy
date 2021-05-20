package com.example.jzoffer.多线程;

/**
 * @Author: cola
 * @Created: cola on 2021/3/12 14:53
 * @Version 1.0
 */
class ThreadImpRunable {
    public static void main(String[] args) {

        MyThreadTest myThreadTest = new MyThreadTest();

        Thread thread = new Thread(myThreadTest);
        Thread thread1 = new Thread(myThreadTest);
        Thread thread2 = new Thread(myThreadTest);


        thread.start();
        thread1.start();
        thread2.start();
//        MyThreadTest myThreadTest = new MyThreadTest();
//        MyThreadTest myThreadTest1 = new MyThreadTest();
//        MyThreadTest myThreadTest2 = new MyThreadTest();
//
//        Thread thread = new Thread(myThreadTest);
//        Thread thread1 = new Thread(myThreadTest1);
//        Thread thread2 = new Thread(myThreadTest2);
//
//        thread.start();
//        thread1.start();
//        thread2.start();


    }
}

class MyThreadTest implements Runnable{

    private int ticket = 100;
    @Override
    public synchronized void run() {

        while (ticket > 0){
            System.out.println(Thread.currentThread().getName() + ":" + ticket--);

            if (ticket <= 0){
                return;
            }
        }
    }
}

