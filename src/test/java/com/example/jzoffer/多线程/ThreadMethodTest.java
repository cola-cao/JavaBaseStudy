package com.example.jzoffer.多线程;

/**
 * @Author: cola
 * @Created: cola on 2021/3/12 10:56
 * @Version 1.0
 *
 * 1.start: 启动当前线程，调用当前run方法
 * 2.run(): 重写此方法
 * 3.currentThread 返回当前代码的线程
 * 4.getName() 获取当前线程的名字
 * 5.setName() 设置当前线程的名字
 * 6.yield() 释放当前cpu的执行权
 * 7.join() 执行调用的线程阻塞，被调用的线程开启
 * 8.stop() 过时
 * 9.sleep() 让当时的线程阻塞多长时间
 * 10.判断当前线程是否还存活
 * 线程的优先级
 *    setPriority(Thread.MAX_PRIORITY);
 *    getPriority();
 *    Thread.currentThread().setPriority(int);
 *    System.out.println(Thread.currentThread().getPriority());
 */

class Hello extends Thread{

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(Thread.currentThread().getName()+"=:"+i+":"+Thread.currentThread().getPriority());

        }
    }
}

public class ThreadMethodTest {

    public static void main(String[] args) {

        Hello hello = new Hello();
        hello.setPriority(Thread.MAX_PRIORITY);
        hello.setName("线程一");
        hello.start();

        Thread.currentThread().setName("主线程");

        Hello hello1 = new Hello();
        hello1.setName("线程二");
        hello1.start();
        for (int i = 0; i < 100; i++) {

            if (i == 20 ){

                try {
                    hello.join(); //在线程hello1 中调用线程hello的join方法，线程hello1阻塞
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(Thread.currentThread().getName() + "=:" +i+":"+Thread.currentThread().getPriority());
        }
    }
}
