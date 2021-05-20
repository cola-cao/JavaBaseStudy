package 锁.Lock;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;

/**
 * @Author: cola
 * @Created: cola on 2021/3/24 16:00
 * @Version 1.0
 */
public class KingLock2 implements Lock {
    //自旋锁
    AtomicReference<Thread> owner = new AtomicReference<>();

    //阻塞队列
    LinkedBlockingDeque deque = new LinkedBlockingDeque();

    /**
     * 获取锁
     */
    @Override
    public void lock() {
        //期望线程为null，占锁
        while (!owner.compareAndSet(null,Thread.currentThread())){
            //望线程不为空，则加入阻塞队列
            deque.add(Thread.currentThread());

            //该队列线程等待被唤醒
            LockSupport.park();

            //为了防止内存泄漏，应该将已经被唤醒的线程移除队列
            deque.remove(Thread.currentThread());
        }

    }

    /**
     * 解锁
     */
    @Override
    public void unlock() {
        //获取到已经完成逻辑的线程，将期望线程置null
        if (owner.compareAndSet(Thread.currentThread(), null)) {
            //释放阻塞队列中的线程
            for (Object o : deque) {
                Thread o1 = (Thread)o;
                //唤醒
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
