package 设计模式.一_单例;

/**
 * @Author: cola
 * @Created: cola on 2021/3/12 10:19
 * @Version 1.0
 */
public class HungrySingleton {

    private static  HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){

        return hungrySingleton;
    }
}
