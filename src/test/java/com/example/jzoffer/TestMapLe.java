package com.example.jzoffer;

import 锁.Lock.kingLock;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import 锁.Lock.kingLock;

/**
 * @Author: cola
 * @Created: cola on 2021/3/16 11:48
 * @Version 1.0
 */
public class TestMapLe {
    public TestMapLe(){
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

     List list = new ArrayList();

     list.add("1111");
     list.add("2222");
     list.add("33333");

     MapLe mapLe = new HashMapLe<Integer, List<String>>(1,list);

     System.out.println(mapLe);
/*
        Class c2 = Class.forName("锁.Lock.kingLock");

        kingLock o = (kingLock)c2.newInstance();

        System.out.println(o + " "+ o.hashCode());

        System.out.println(c2);
        kingLock kingLock1 = new kingLock();
        kingLock kingLock2= new kingLock();
        kingLock kingLock3 = new kingLock();

        System.out.println(kingLock1.hashCode());
        System.out.println(kingLock2.hashCode());
        System.out.println(kingLock3.hashCode());

        System.out.println(kingLock1);
        System.out.println(kingLock2);
        System.out.println(kingLock3);*/

        Class clazz = Class.forName("IO.FileReaderWriterTest");
        Class clazz2 = mapLe.getClass();

    }


}
