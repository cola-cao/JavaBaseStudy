package java基础;

public class Main {
    public static void main(String[] args) {

        System.out.println(12%2);
        split(12);
    }
    public static int split(int number) {
        if (number > 1) {
            if (number % 2 != 0){
                System.out.print(split((number + 1) / 2));
                System.out.print(split(number / 2));
            }


        }
        return number;
    }
}
