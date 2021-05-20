package 锁.Lock;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;

/**
 * @Author: cola
 * @Created: cola on 2021/3/14 19:35
 * @Version 1.0
 */
public class kingLock implements Lock {

    kingLock(){

    }
    //房卡 具有唯一性，原子性的线程去开房
    AtomicReference<Thread> owner = new AtomicReference<>(); //房卡，线程安全

    //设置阻塞队列，link效率更高,没有抢到锁的，进入队列
    LinkedBlockingQueue waiter = new LinkedBlockingQueue<>();



    //加锁
    @Override
    public void lock() {
     //   owner.compareAndSet(null,Thread.currentThread()); //V expectedValue 期望值，我们这里期望没有线程, V newValue 新线程
        //如果返回为true 则为抢到锁，false 为没有抢到锁

        //把没有抢到锁的线程放入阻塞队列
        while (!owner.compareAndSet(null,Thread.currentThread())){

            waiter.add(Thread.currentThread()); //抢锁失败 ，放入阻塞队列
            LockSupport.park();//让当前线程阻塞 park 停车
            waiter.remove(Thread.currentThread()); //防止内存泄漏，删除队列中没有抢到锁的线程
        }

    }
    //解锁
    @Override
    public void unlock() {

        //持有锁的线程才能真正解锁
        //如果预期线程是占据锁的线程，则解锁并返回true,否则返回false
        // owner.compareAndSet(Thread.currentThread(),null);
        if(owner.compareAndSet(Thread.currentThread(),null)){ //如果解锁成功
             //唤醒全部线程
            for (Object o : waiter.toArray()) {
                Thread o1 = (Thread) o;
                LockSupport.unpark(o1);
            }

        }else {

        }

    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public Condition newCondition() {
        return null;
    }
}
