package src.day05;

import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {
//        int count =0;
//        do {
//            System.out.println("剩下不到一小時請加油");
//            count++;
//        }while (count<3);
//        System.out.println("循環結束");


        int random = (int) (Math.random() * 100);
        Scanner s = new Scanner(System.in);
        int user;
        do {
            System.out.println("請猜0~99");
            user = s.nextInt();
            if (user == random) {
                System.out.println("猜對了");
            } else if (user > random) {
                System.out.println("猜的太大了");
            } else if (user < random) {
                System.out.println("猜的太小了");
            }
        } while (user != random);//循環條件:猜錯持續重來


    }
}
