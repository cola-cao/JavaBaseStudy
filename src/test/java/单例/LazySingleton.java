package 单例;

/**
 * @Author: cola
 * @Created: cola on 2021/3/12 10:22
 * @Version 1.0
 */
public class LazySingleton {

    private volatile static LazySingleton lazySingleton= null;

    private LazySingleton(){

    }

    public static LazySingleton getInstance() {

        if (null == lazySingleton) {
            synchronized (LazySingleton.class) {
                if (null == lazySingleton) {
                    lazySingleton = new LazySingleton();
                }
            }
        }

        return lazySingleton;
    }
}


