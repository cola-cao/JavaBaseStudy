package 锁.Lock;

import java.sql.Timestamp;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: cola
 * @Created: cola on 2021/3/14 17:57
 * @Version 1.0
 */
public class RushOrderLock {



    //static int i = 60000;
    //int i = 60000;
    AtomicInteger i =  new AtomicInteger(60000);

    public void order(){
        i.decrementAndGet();
    }

    public static void main(String[] args) throws InterruptedException {
        RushOrderLock rushOrder = new RushOrderLock();
        //开启6个线程处理一下

        for (int i = 0; i < 6; i++) {
            new Thread(()->{ //JDK1.8的方式 == run()
//                synchronized (RushOrder.class){
//                    for (int j = 0; j < 10000; j++) {
//                        rushOrder.order();
//                    }
//                }

                for (int j = 0; j < 10000; j++) {
                    rushOrder.order();
                }

            }).start();
        }
        Timestamp timestamp  = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);
        //Thread.sleep(5000);

        System.out.println("库存量:"+rushOrder.i);
    }
}
