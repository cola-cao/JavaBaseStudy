package 面试;


import java.util.*;

/**
 * @Author: cola
 * @Created: cola on 2021/3/13 17:22
 * @Version 1.0
 */
public class ArryListIterator{

    private static ArrayList arrayList = new ArrayList<Integer>();

    static {
        arrayList.add("11");
        arrayList.add("22");
        arrayList.add("33");
    }



    public static void main(String[] args) {

        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext()){

            System.out.println(iterator.next());

            arrayList.remove("11");
        }
//        String count ="1" + "2" +3 +"4" + "5";
//        System.out.println(count);
//
//        String count1 ="1" + "2" +"3" +"4" + "5";
//        System.out.println(count1);

//        ArrayList<String> objects = new ArrayList<>();
//        objects.add("44");
//
//        arrayList.add(1,"1");
//        //arrayList.remove("1");
//        System.out.println(arrayList);
//        System.out.println(arrayList.containsAll(objects));
//
//
//        int[] a = {1,2,3};
//        String s = Arrays.toString(a);
//        System.out.println(s);



    }


}
