package com.example.jzoffer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

/**
 * @Author: cola
 * @Created: cola on 2021/3/2 20:28
 * @Version 1.0
 */
@SpringBootTest
public class Map练习 {

    @Test
    void  test1(){

        HashMap<Object, Object> map = new HashMap<>();
        //添加
        map.put("AA",123);
        map.put("bb",123);
        map.put("cc",123);
        map.put("dd",123);
        //修改
        map.put("AA",48);

        HashMap map1 = new HashMap();
        map1.put("333",5555);
        map1.put("AA",5555);

        map.putAll(map1);
        System.out.println(map);

        Collection<Object> values = map.values();

        for (Object value : values) {
            System.out.println(value);
        }


    //方式一    entrySet();
        Set entries = map.entrySet();
        System.out.println(entries);
        Iterator iterator1 = entries.iterator();
        
        while (iterator1.hasNext()){
            Map.Entry next = (Map.Entry) iterator1.next();

            System.out.println(next.getKey()+"->"+next.getValue());
        }
     //方式二
        Set set = map.keySet();
        System.out.println(set);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next+"="+map.get(next));
        }



    }
}
