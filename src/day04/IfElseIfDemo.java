package src.day04;

import java.util.Scanner;

public class IfElseIfDemo {
    public static void main(String[] args) {

                //多路分支範例:購物滿額1000打七折，滿額800八折，滿額600九折，全館最低95折
        Scanner s = new Scanner(System.in);
        System.out.println("請輸入消費金額:");
            double p = s.nextDouble();
            if (p >= 1000) {
                p *= 0.7;
                System.out.println("消費滿額可打七折，應付金額:" + p);
            } else if (p >= 800) {
                p *= 0.8;
                System.out.println("消費滿額可打八折，應付金額:" + p);
            } else if (p >= 600) {
                p *= 0.9;
                System.out.println("消費滿額可打九折，應付金額:" + p);
            } else {
                p *= 0.95;
                System.out.println("全館九五折，應付金額:" + p);
            }
                System.out.println("已付金額:" + p);

        Scanner ss = new Scanner(System.in);
        System.out.println("請輸入成績:");
            int score = ss.nextInt();
            if (score<0||score>100){
                System.out.println("數據不合理");
            }else if (score>=90){
                System.out.println("優良");
            }else if (score>=80){
                System.out.println("良好");
            }else if (score>=70){
                System.out.println("一般");
            }else if (score>=60) {
                System.out.println("及格");
            }else {
                System.out.println("不及格");
            }

        Scanner sss = new Scanner(System.in);
        System.out.print("請輸入年齡:");
            int a = sss.nextInt();
            if (a >= 0 && a < 5) {
                System.out.println("幼年");
            } else if (a >= 5 && a < 18) {
                System.out.println("青年");
            } else if (a >= 18 && a < 35) {
                System.out.println("成年");
            } else if (a >= 35 && a < 50) {
                System.out.println("中年");
            } else if (a >= 50 && a < 65) {
                System.out.println("中老年");
            } else if (a >= 65 && a < 150) {
                System.out.println("老年");
            } else {
                System.out.println("輸入年齡不合法");
        }
    }

}
