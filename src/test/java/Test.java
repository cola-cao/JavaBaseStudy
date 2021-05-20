/**
 * @Author: cola
 * @Created: cola on 2021/3/15 20:57
 * @Version 1.0
 */
// 父变量 -> 父方法 -> 子变量 ->子方法
class X{
    Y y=new Y();
    public X(){
        System.out.print("X");
    }
}
class Y{
    public Y(){

        Double od = 3.0;
        System.out.print("Y");

    }

}
class Z extends X{
    Y y=new Y();
    public Z(){
        System.out.print("Z");
    }
    public static void main(String[] args) {
        new Z();
    }
}