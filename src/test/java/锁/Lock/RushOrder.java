package 锁.Lock;

import java.sql.Timestamp;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: cola
 * @Created: cola on 2021/3/14 17:57
 * @Version 1.0
 */
public class RushOrder {

    //static int i = 60000;
    int i = 60000;
    Lock lock =  new ReentrantLock();
    //kingLock lock = new kingLock();
    public void order(){

        lock.lock();
        try {
            i--;
        }finally {

            lock.unlock();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        RushOrder rushOrder = new RushOrder();
        //开启6个线程处理一下

        for (int i = 0; i < 6; i++) {
            new Thread(()->{     //JDK1.8的方式 == run()

                for (int j = 0; j < 10000; j++ ) {
                    rushOrder.order();
                }
            }).start();

        }
        Timestamp timestamp  = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);
        Thread.sleep(1000);


        System.out.println("库存量:"+rushOrder.i);
    }
}
