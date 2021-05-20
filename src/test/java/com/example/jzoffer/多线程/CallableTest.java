package com.example.jzoffer.多线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author: cola
 * @Created: cola on 2021/3/12 20:20
 * @Version 1.0
 */
public class CallableTest {

    public static void main(String[] args) {
        //1.实现Callable
        NumThread numThread = new NumThread();
        //2.使用FutureTask(包装)
        FutureTask futureTask = new FutureTask(numThread);
        //3.启动线程
        new Thread(futureTask).start();

        try {
            //获取返回值
            Object o = futureTask.get();
            System.out.println("总和为：" + o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

//1.实现Callable
class NumThread implements Callable{
    @Override
    public Object call() throws Exception {
        int num = 0;
        for (int i = 0; i < 100; i++) {
            if (i %2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" +i);
                num += i;
            }
        }
        return num;
    }
}
