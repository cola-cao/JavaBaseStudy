package java基础;


import org.junit.jupiter.api.Test;

/**
 * @Author: cola
 * @Created: cola on 2021/3/15 21:31
 * @Version 1.0
 */

final  class Test1 {
    Integer i01 = 59;
    int i02 = 59;
    Integer i03 = Integer.valueOf(59);
    Integer i04 = new Integer(59);

    @Test
    void test11(){
        System.out.println(i01 == i02);
        System.out.println(i01 == i03);
        System.out.println(i03 == i04);
        System.out.println(i02 == i04);

        this.test2();
    }


    void test2(){

    }

    protected static final class Test3{

    }
}
