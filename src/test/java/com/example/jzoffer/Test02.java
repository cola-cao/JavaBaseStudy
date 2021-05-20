package com.example.jzoffer;

import java.lang.annotation.*;
import java.util.Map;

/**
 * @Author: cola
 * @Created: cola on 2021/3/8 13:34
 * @Version 1.0
 */
//测试元注解
public class Test02 {

    @MyAnnotation02(value = {},age = 0)
    public static void main(String[] args) {

    }
}

//表示注解可以用在哪些地方
@Target(value = {ElementType.METHOD,ElementType.TYPE})
//有效级别 RunTime>Class>Resource(源码)
@Retention(value = RetentionPolicy.RUNTIME)
//子类可以继承父类的注解
@Inherited
//表示是否将代码生产在Javadoc中
@Documented
@interface MyAnnotation{
   String[] value()  default {};

}



@Target(value = {ElementType.METHOD,ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
@interface MyAnnotation02{
    //只有一个参数时 方法名设置为value ，应用注解时可以直接写参数不用写方法名
    String[] value() default {};

    int age() default 0;

    int id() default -1; //default ->表示不存在

    String school() default "郑州升达经贸管理学院";
}