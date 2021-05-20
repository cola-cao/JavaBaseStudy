package com.example.jzoffer;

/**
 * @Author: cola
 * @Created: cola on 2021/3/6 9:41
 * @Version 1.0
 */
public class JvmTest implements Test1{
    @Override
    public void test1() {

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+ ":" + i);
        }
    }
}


interface Test1{

    void test1();
}
