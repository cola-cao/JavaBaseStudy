package java基础;

/**
 * @Author: cola
 * @Created: cola on 2021/3/20 22:29
 * @Version 1.0
 */
class Car extends Vehicle
{
    public static void main (String[] args)
    {
        new  Car(). run();
    }

    private final void run()
    {
        System. out. println ("Car");
    }
}
class Vehicle
{
    private final void run()
    {
        System. out. println("Vehicle");
    }
}
