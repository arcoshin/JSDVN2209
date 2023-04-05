package src.day04;

import java.util.Scanner;

public class IfElseDemo {

    public static void main(String[] args) {
        //雙路分支範例:購物滿額500打八折，未滿額九折
        Scanner s = new Scanner(System.in);
        System.out.println("請輸入消費金額:");
        double p = s.nextDouble();
        if (p >= 500) {
            p *= 0.8;
            System.out.println("消費滿額打完八折應付:" + p);
        } else {
            p *= 0.9;
            System.out.println("消費未滿額適用全館九折應付:" + p);
        }
            System.out.println("已付款:" + p);
    }
}
