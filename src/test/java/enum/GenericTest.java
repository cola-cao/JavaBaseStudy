
import java.util.ArrayList;
import java.util.List;

class Father extends Human{}
class Son extends Father{}
class LiLei extends Son{}
class Human{}


public class  GenericTest {
    public static void main(String[] args) {
        ArrayList<LiLei> liLeis = new ArrayList<>();
        liLeis.add(new LiLei());
        List<? extends Father> list1 = liLeis;
        List<? extends Father> list2 = new ArrayList<Son>();
        System.out.println(list1.get(0));

        List<?> list = new ArrayList<String>();
    }

   
}