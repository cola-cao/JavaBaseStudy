package com.example.jzoffer;

import net.bytebuddy.implementation.bytecode.Throw;
import org.mockito.internal.stubbing.answers.ThrowsException;

/**
 * @Author: cola
 * @Created: cola on 2021/3/23 22:47
 * @Version 1.0
 */
public class TestTryCath {
    private static float f= 10f;

      abstract static class Inner{
         static float func(){
            return f;
        }
    }
   static class Inner1{
        protected static float func(){

            return f;
        }
    }

    public static void main(String[] args) {

        System.out.println(add());
        class inner3{

        }
    }

   static int add(){
        try {
            int i = 2;

            System.out.println("try");
            //return 3;
            throw new Exception();
        }catch (Exception e){

            System.out.println("catch");
            return 5;
        }finally {
            System.out.println("finally");
            return 4;
        }
    }
}
