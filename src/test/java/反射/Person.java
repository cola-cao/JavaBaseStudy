package 反射;

import org.junit.platform.commons.util.StringUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created on 2021/5/18.
 *
 * @author 曹可乐
 */
public class Person<T> {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    private Person(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void show(){
        System.out.println("你是一个怪物");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {


        Class clazz = Person.class;

        Constructor constructor = clazz.getConstructor(String.class, int.class);
        Person person1 = (Person) constructor.newInstance("小明", 10);
        System.out.println(person1.toString());
        Field age = clazz.getDeclaredField("age");
        age.set(person1,11);
        System.out.println(person1.getAge());

        Method show = clazz.getDeclaredMethod("show");
        show.invoke(person1);

        //通过反射获取使用私有构造函数
        Constructor constructor1 = clazz.getDeclaredConstructor(int.class);
        Person person = (Person)constructor1.newInstance(23);

        System.out.println(person);


    }
}