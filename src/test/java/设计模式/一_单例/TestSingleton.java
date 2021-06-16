package 设计模式.一_单例;

/**
 * @Author: cola
 * @Created: cola on 2021/3/12 10:28
 * @Version 1.0
 */
public class TestSingleton {
    public static void main(String[] args) {
        HungrySingleton instance = HungrySingleton.getInstance();
        System.out.println(instance);

        LazySingleton instance1 = LazySingleton.getInstance();
        System.out.println(instance.getClass().getName());
    }
}
