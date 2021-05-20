package 反射;

/**
 * Created on 2021/5/18.
 *
 * @author 曹可乐
 */
public class Person<T> {

    private T clazz;
    private int age;

    private Person(){

    }

    private Person(T clazz,int age){
     this.clazz = clazz;
     this.age = age;
    }

    public T getClazz() {
        return clazz;
    }

    public void setClazz(T clazz) {
        this.clazz = clazz;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "clazz=" + clazz +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {


        Class personClass = Person.class;
    }
}
