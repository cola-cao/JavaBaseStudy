package 设计模式.一_单例;

/**
 * Created on 2021/6/15.
 *
 * @author 曹可乐
 */
public class StaticNer {

    private StaticNer(){

    }

    static class StaticNer2{
        private static final StaticNer starter =  new StaticNer();
    }

    public StaticNer getInstance(){

        return StaticNer2.starter;
    }

}
