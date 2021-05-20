package IO;

import java.util.List;

/**
 * @Author: cola
 * @Created: cola on 2021/3/14 23:17
 * @Version 1.0
 */
public class Person<V>{

    private int age;
    private String name;
    private List child;

    public Person() {
    }

    public Person(int age, String name, List child) {
        this.age = age;
        this.name = name;
        this.child = child;
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

    public List getChild() {
        return child;
    }

    public void setChild(List child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return "IO.Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", child=" + child +
                '}';
    }
}
