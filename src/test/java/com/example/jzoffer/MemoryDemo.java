package com.example.jzoffer;

/**
 * @Author: cola
 * @Created: cola on 2021/3/5 21:12
 * @Version 1.0
 */
public class MemoryDemo {
    public static void main(String[] args) {
        long l = Runtime.getRuntime().maxMemory();
        long l1 = Runtime.getRuntime().totalMemory();
        System.out.println(l);
        System.out.println(l1);
    }
}
