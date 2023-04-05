package src.day05;

import java.util.Scanner;

/**
 * 當已知循環條件且已知循環次數時，可以使用 For 循環
 * for(起始變量；循環條件；基於循環變量的改變){循環體}
 * for(int i = 0; i < 10; i++)
 */
public class ForDemo01 {
    public static void main(String[] args) {

//        for (int i = 0; i < 3;i++){
//            System.out.println("同學們繼續努力!!");
//        }

//        //循環中的關鍵字 : continue; ，遇到則跳過當次循環，直接執行自增。
//
//        for (int i = 0; i < 10; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i + "偶數");
//                continue;//跳過當次循環，直接下次循環，避免貫穿執行其他語句
//            }
//                System.out.println(i + "奇數");
//
//        }

        //循環中的關鍵字 : break; ，遇到則退出當前循環，代碼繼續向下執行
//        for (int i = 1; i < 10; i++) {
//            if (i > 5) {
//                System.out.println("小明同學肚子痛無法繼續進行比賽了!!");
//                break;//結束當次循環
//            }
//            System.out.println("小明同學正在跑第" + i + "圈");
//        }
//        System.out.println("不跑了，中止比賽!!");

        /**
         * continue的練習題
         * 1~100之間能被所有能被3整除的數字和
         */
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0) {
//                sum += i;
//            }
//            continue;
//
//
//        }
//        System.out.println("總合為:"+sum);


        /**
         * break的練習題
         * 1~100的數字和，並於>=2500停止，並記錄當前該數為何，其總合?
         */
        int sum = 0;//總和
        int lastnum = 0;//最後一次加的數
        for (int i = 1; i <= 100; i++) {
            if (sum >= 2500) {
                lastnum = i;
                break;
            }
            sum += i;
        }
        System.out.println("停止運算時的總合為:"+sum);
        System.out.println("最後一次所加的數為:"+lastnum);


        /**
         * for循環的練習題
         * 隨機兩個100以內數字相加練習題，並根據用戶答案給分並評等。
         */

//        int score = 0;
//        for (int i = 1; i <= 10; i++) {
//            int num01 = (int) (Math.random() * 100);
//            int num02 = (int) (Math.random() * 100);
//            System.out.println("第" + i + "題:" + num01 + "+" + num02 + "=?");
//            Scanner s = new Scanner(System.in);
//            int user = s.nextInt();
//
//            if (user == num01 + num02) {
//                System.out.println("恭喜答對了!!");
//                score += 10;
//                continue;
//            }
//            System.out.println("答錯了!!");
//
//        }
//        System.out.println("恭喜答題全部完成，您的分數為"+score+"分");
//        if (score == 100){
//            System.out.println("您的分數等極為:頂尖");
//        }else if (score<=100&&score>=80){
//            System.out.println("您的分數等極為:優良");
//        }else if (score<=80&&score>=60){
//            System.out.println("您的分數等極為:尚可");
//        }else {
//            System.out.println("您的分數等極為:不及格");
//        }
//


    }
}
