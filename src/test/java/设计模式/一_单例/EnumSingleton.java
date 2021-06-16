package 设计模式.一_单例;

/**
 * Created on 2021/6/16.
 *
 * @author 曹可乐
 */
public enum  EnumSingleton {

    INSTANCE;
    private EnumSingleton(){}

    void test(){
        System.out.println("测试成功");
    }

    public static void main(String[] args) {

        EnumSingleton instance = EnumSingleton.INSTANCE;
        instance.test();
    }
}
