package 高精度数的计算;

import java.math.BigDecimal;

/**
 * Created on 2021/5/19.
 *
 * @author 曹可乐
 */
public class Test {

    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(0.5);
        System.out.println(bigDecimal.add(new BigDecimal(0.1)));
    }
}
