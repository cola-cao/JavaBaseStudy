package 设计模式.一_单例;

/**
 * @Author: cola
 * @Created: cola on 2021/4/10 11:19
 * @Version 1.0
 */
public class LazySingleton2 {

    private static volatile LazySingleton2 lazySingleton2 = null;

    private LazySingleton2(){

    }

    public static LazySingleton2 getLazySingleton2(){

        if (lazySingleton2 == null){
             //10
            synchronized (LazySingleton2.class){
                if (null == lazySingleton2){
                    lazySingleton2 = new LazySingleton2();
                }
            }
        }
        return lazySingleton2;
    }
}
