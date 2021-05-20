package java基础;

import IO.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: cola
 * @Created: cola on 2021/3/18 19:15
 * @Version 1.0
 */
public class Test2 extends Test3{
    static {
        System.out.println("6666666");
    }
    {
        System.out.println("888888888");
    }
    Test2(){
        System.out.println("77777777");
    }
    public static void main(String[] args) {
        new Test2();
        Test3.test4();


    }
}

class Test3{

    private static final int age = 15;
    static {
        System.out.println("2222222222");
    }



    static {
        System.out.println("4444444");
    }
    public Test3() {
        System.out.println("11111111");
    }

    {
        System.out.println("33333333");
    }

    static void test4(){
        System.out.println("5555555");
    }
}



