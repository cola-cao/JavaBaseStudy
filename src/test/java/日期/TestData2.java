package 日期;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created on 2021/5/20.
 * @author 曹可乐
 */
public class TestData2 {

    //jdk1.8之后
    public static void main(String[] args) {
        //now() 获取当前的日期 时间 日期加时间
        LocalDate now = LocalDate.now(); System.out.println(now);
        LocalTime now1 = LocalTime.now();System.out.println(now1);
        LocalDateTime now2 = LocalDateTime.now();System.out.println(now2);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");


        //of():设置指定的年月日时分秒。没有偏移量
        LocalDateTime of = LocalDateTime.of(2021, 5, 20, 16, 36, 36);
        System.out.println(of);

        //获取特殊值 getXxx
        System.out.println(now2.getDayOfMonth());
        System.out.println(now2.getDayOfWeek());
        System.out.println(now2.getMonth());
        System.out.println(now2.getMonthValue());
        System.out.println(now2.getMinute());
        System.out.println(now2.getHour());
        System.out.println(now2.getNano());

        // withXxx 修改
        System.out.println(now2.withDayOfMonth(23));


        //plus 加时间
        System.out.println(now2.plusDays(5));

        //格式化
        String format = dateTimeFormatter.format(now2.plusDays(-1));
        System.out.println(format);

    }
}
