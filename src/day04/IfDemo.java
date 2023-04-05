package src.day04;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        /**
         *  if (條件){條件成立所要執行的項目}
         */

        //單路分支範例:購物滿500打八折
        Scanner s = new Scanner(System.in);
        System.out.println("請輸入消費金額:");
        double price = s.nextDouble();
        if (price >= 500) {
            price *= 0.8;
            System.out.println("消費滿額可打八折，應付金額為:" + price + "元");
        }
        System.out.println("已付金額" + price);








    }
}
