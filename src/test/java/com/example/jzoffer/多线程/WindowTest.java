package com.example.jzoffer.多线程;

/**
 * @Author: cola
 * @Created: cola on 2021/3/12 14:35
 * @Version 1.0
 */
public class WindowTest {
    public static void main(String[] args) {

        Ticket ticket1 = new Ticket();
        ticket1.start();
        Ticket ticket = new Ticket();
        ticket.start();
        Ticket ticket2 = new Ticket();
        ticket2.start();

        System.out.println(Thread.currentThread().getState());


    }

}


class Ticket extends Thread{
    private static int ticket = 100;
    private static Object object = new Object();
    @Override
    public void run() {

            while (true){
                synchronized(object){
                try {
                    sleep(0);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (ticket <= 0 ){
                    return;
                }
                    System.out.println(getName() + ":买票，票号为:" + ticket--);
            }
        }

    }
}