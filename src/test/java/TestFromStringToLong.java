import org.junit.platform.commons.util.CollectionUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created on 2021/5/18.
 *
 * @author 曹可乐
 */
public class TestFromStringToLong {
    public static void main(String[] args) {
        String[] strings = {"1", "2"};
        if (strings != null){

            System.out.println("88888888888888");
        }
        List<Long> collect = Arrays.stream(strings)
                .map(s -> Long.parseLong(s.trim())).collect(Collectors.toList());
        for (Long aLong : collect) {
            System.out.println(aLong);
        }
        String serviceName ="";
        Iterator<Long> iterator = collect.iterator();
        String sql1 = "SELECT service_name FROM basicdata_service WHERE service_id in(";

        String sql = "";
        System.out.println(strings.toString());
        if (strings != null ) {
           while (iterator.hasNext()){
               sql += iterator.next();
               if (iterator.hasNext()){
                   sql += ",";
               }
           }

           sql1 += ");";

            System.out.println(sql);
        }

        System.out.println(sql1);

         String[] serviceIds = {"1", "2"};
         String serviceIdsConcat = "";

        for (int i = 0; i < serviceIds.length; i++) {
            serviceIdsConcat += serviceIds[i];
            if (i+1<serviceIds.length){
                serviceIdsConcat += ",";
            }

        }

        System.out.println(serviceIdsConcat);
  }
}