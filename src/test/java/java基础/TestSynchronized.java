package java基础;

/**
 * @Author: cola
 * @Created: cola on 2021/3/30 20:57
 * @Version 1.0
 */
public class TestSynchronized {

        private synchronized void a() {
            System.out.println(this);
        }
        private void b() {
            synchronized (this) {
                System.out.println(this);
            }
        }
        private synchronized static void c() {
            System.out.println(Thread.currentThread().getName());
        }
        private void d() {
            synchronized (TestSynchronized.class) {
                System.out.println();
            }
        }

    public static void main(String[] args) {
        TestSynchronized t = new TestSynchronized();
        t.a();
        t.b();
        TestSynchronized.c();
        t.d();
    }
}
