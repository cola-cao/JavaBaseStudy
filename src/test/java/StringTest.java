
import java.util.Arrays;
import java.util.List;

/**
 * Created on 2021/5/24.
 * @author 曹可乐
 */
public class StringTest {
    public static void main(String[] args) {

        String str = "xiaotuzi,xiaoHu,xiaoGou,xiaoWugui,xiaolong";
        String s1 = str.replaceAll("xiao", "wang");
        //String s2 = s1.toUpperCase();
        String s2 = s1.toLowerCase();
        String[] split = s2.split(",");
        for (String s : split) {
            System.out.println(s);
        }
        System.out.println("-------------------");
        String s = String.valueOf(123123);
        System.out.println("s= "+s + s.getClass());
        int i = Integer.parseInt(s);
        System.out.println("i =" +i);


        String[] strings = {"xiaotuzi","xiaoHu","xiaoGou","xiaoWugui","xiaolong"};
        List<String> list = Arrays.asList(strings);

        int[] arr = {1,2,3,4,5,6,7};

        String s3 = Arrays.toString(arr);
        //String substring = s3.substring(1, s3.length() - 1);
        System.out.println(s3);

        System.out.println(s3);

        List<String> list1 = Arrays.asList(s3);
        String s4 = list1.toString();
        System.out.println(s4.substring(2,s4.length() - 2));

        //数组->list Arrays.asList()
        //list ->数组  list.totoArray();
        //数组 -> 字符串 Arrays.toString(arr) subString(0,x.length()-2)
        //list -> 字符串 list1.toString() s4.substring(2,s4.length() - 2)


    }
}
