package com.example.jzoffer;


import java.util.*;

/**
 * @Author: cola
 * @Created: cola on 2021/4/18 11:56
 * @Version 1.0
 */
public class 集合 {

    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("xiaoming");
        list.add("fdsfds");
        list.add("4343");
        list.add("76787");

        List list1 = new ArrayList<>();
        list1.add(list);
        list.add("xiaohong");
        System.out.println(list1);


        Collections.synchronizedList(list);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }

    }
}
