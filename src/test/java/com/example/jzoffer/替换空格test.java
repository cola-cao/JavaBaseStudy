package com.example.jzoffer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

/**
 * @Author: cola
 * @Created: cola on 2020/11/13 22:36
 * @Version 1.0
 */
@SpringBootTest
public class 替换空格test {
    /**
     * 执行用时：
     * 3 ms
     * , 在所有 Java 提交中击败了
     * 11.32%
     * 的用户
     * 内存消耗：
     * 36.5 MB
     * , 在所有 Java 提交中击败了
     * 63.40%
     * 的用户
     * @param s
     * @return
     */
    public String replaceSpace1(String s) {
        String s1 = s.replaceAll(" ", "%20");
        return s1;
    }

    public String replaceSpace2(String s) {
        int length = s.length();
        char[] array = new char[length * 3];
        int size = 0;
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                array[size++] = '%';
                array[size++] = '2';
                array[size++] = '0';
            } else {
                array[size++] = c;
            }
        }
        String s1 = new String(array, 0, size);
        return s1;
    }

    @Test
    void test1(){
        String s = replaceSpace2("We are happy.");
        System.out.println(s);

        new Vector<>();

    }

    @Test
    void test2(){
        List list = new ArrayList<>();
        list.add(123);
        list.add(21321);
        list.add(312);
        list.add("fdsfdf");

        Class<?> aClass = list.get(0).getClass();
        System.out.println(aClass);

        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add("hhiu");
        arrayList.add(489);
        arrayList.add(null);
        list.addAll(arrayList);
        System.out.println(list);
        list.remove("hhiu");
        System.out.println(list);
        for (Object o : list) {
            System.out.println(o);
        }


    }
    @Test
    void setTest(){
        HashSet set = new HashSet<>();

        Person p1 = new Person(11, "张三");
        Person p2 = new Person(11, "李四");

        set.add(p1);
        set.add(p2);
        set.add(null);


        System.out.println(set);
        System.out.println(p1.hashCode());
        p1.name = "cc";
        System.out.println(p1.hashCode());
        set.remove(p1);
        System.out.println(set);

    }

    class Person{
        int age;
        String name;

        public Person() {
        }

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "IO.Person{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person)) return false;
            Person person = (Person) o;
            return age == person.age &&
                    name.equals(person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(age, name);
        }
    }

}
