package com.example.jzoffer;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author: cola
 * @Created: cola on 2021/3/5 22:48
 * @Version 1.0
 */
public class MemoryTest {
    byte[] a = new byte[1024 * 100];

    public static void main(String[] args) throws InterruptedException {

        ArrayList<MemoryTest> heapTests = new ArrayList<>();
        Thread.sleep(10000);

        while(true){
            heapTests.add(new MemoryTest());
            Thread.sleep(100);
        }

    }
}
