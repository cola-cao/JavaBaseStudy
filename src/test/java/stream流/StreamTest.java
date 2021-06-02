package stream流;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * Created on 2021/5/24.
 *
 * @author 曹可乐
 */
public class StreamTest {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        //过滤空字符
        List<String> filterd = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println(filterd);

        //forEach
       filterd.forEach(System.out::println);

        for (String s : filterd) {
            System.out.print(s);
        }

        //map
        List<Integer> integers = Arrays.asList(1, 2, 3, 45, 6, 7, 8, 9);
        List<Integer> collect = integers.stream().map(integer -> {
            return integer * integer;
        }).distinct().collect(Collectors.toList());
        System.out.println("计算平方 map = "+collect.toString());

        String collect1 = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("合并字符串: " + collect1);

        String collect2 = filterd.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(","));

        System.out.println(collect2);

    }
}

