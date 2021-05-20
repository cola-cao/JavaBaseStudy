package 动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: cola
 * @Created: cola on 2021/3/17 14:55
 * @Version 1.0
 */

interface Human{
    String getBelief();

    void eat(String food);
}

//被代理对象
class SuperMan implements Human{

    @Override
    public String getBelief() {
        return "I believe I can fly!";
    }

    @Override
    public void eat(String food) {
        System.out.println("超人喜欢吃"+food);
    }
}

/**
 *  要实现动态代理，需要解决的问题？
 *  1.如何根据加载到内存中的被代理类，动态的创建一个代理类及其对象
 *  2.当通过代理类的对象调用方法时，如何动态的去调用被代理类中的同名方法
 */

class MyInvocationHandler implements InvocationHandler{

    private Object obj;

    public void bind(Object obj){
        this.obj = obj;
    }
    //同名调用方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("日志被调用了");
        Object invoke = method.invoke(obj, args);
        System.out.println("日志被调用之后");
        return invoke;
    }
}

class ProxyFactory{
    public static Object getProxyInstance(Object obj){ // obj是代理的对象
        MyInvocationHandler handler = new MyInvocationHandler();
        handler.bind(obj);

        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),handler);
    }
}

public class ProxyTest {

    public static void main(String[] args) {

        SuperMan superMan = new SuperMan();
        Human proxyInstance = (Human) ProxyFactory.getProxyInstance(superMan);

        proxyInstance.eat("屎");
    }

}
