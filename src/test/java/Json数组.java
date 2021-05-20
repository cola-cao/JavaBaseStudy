import IO.Person;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;

import java.util.List;

/**
 * @Author: cola
 * @Created: cola on 2021/3/14 22:55
 * @Version 1.0
 */
public class Json数组 {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("1");
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        Person person = new Person(35,"大话",list);

        String jsonString = JSON.toJSONString(person);
        JSONObject jsonObject = JSON.parseObject(jsonString);

        String jsonString1 = jsonObject.toJSONString();

        System.out.println(jsonObject);
        System.out.println(jsonString);
        System.out.println(jsonString);

        System.out.println(jsonString1);


    }
}
