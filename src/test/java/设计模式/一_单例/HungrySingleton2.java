package 设计模式.一_单例;

/**
 * @Author: cola
 * @Created: cola on 2021/4/10 11:17
 * @Version 1.0
 */
public class HungrySingleton2 {

    private static HungrySingleton2 hungrySingleton2 = new HungrySingleton2();

    private HungrySingleton2(){

    }

    public static HungrySingleton2 getHungrySingleton2(){

        return hungrySingleton2;
    }
}
