package 泛型;

import java.util.ArrayList;

/**
 * Created on 2021/5/28.
 *
 * @author 曹可乐
 */
public class GenericsTest<T> {
    public static void main(String[] args) {

        Integer[] arr =  {1, 8, 15, 6, 3};
        Double[] douArr = {10.5, 25.1, 4.9, 1.8};
        String[] strArr = {"我","是","字","符","串"};

        forArrGenric(arr);

        ArrayList<Integer> ts2 = new ArrayList<>();
        ts2.add(10);
        ts2.add(25);
        ts2.add(30); //编译器提示报错，无法添加非Integer类型
        PageInfo objectPageInfo = new PageInfo<>();
        objectPageInfo.setList(ts2);
        System.out.println(objectPageInfo.getList().getClass());

    }
    //泛型方法
    public static <T> void forArrGenric(T[] arr) {
        for(int i=0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
