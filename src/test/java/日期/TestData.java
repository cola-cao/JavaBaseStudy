package 日期;


import org.junit.jupiter.api.Test;
import org.mockito.internal.util.StringUtil;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import javax.xml.crypto.Data;

/**
 * Created on 2021/5/18.
 *
 * @author 曹可乐
 */
public class TestData {

    //JDK1.8之前的API
    //1.System.currentTimeMillis()
    //2.java.util.Date   java.sql.Date
    //3.java.text.SimpleDateFormat
    @Test
    public void test(){
        System.out.println(System.currentTimeMillis());
    }

    //java.utils.Date
    @Test
    public void test1() throws ParseException {
        //java.utils.Date
        Date data = new Date();

        System.out.println(data.toString());
        System.out.println(data.getTime());

        long l = System.currentTimeMillis();

        Date data1 = new Date(l);
        System.out.println(data1);

        //java.sql.Date
        java.sql.Date date = new java.sql.Date(l);
        System.out.println(date);



       //3.java.text.SimpleDateFormat 日期->字符串  解析: 字符串 -> 日期
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1 = new Date();
        System.out.println("data2:" + data1);
        System.out.println(format.format(date1));

        //解析
        String sql = "2021-05-18 06:58:23";
        System.out.println(format.parse(sql));

        System.out.println(3<<5);

    }

}
