package src.day06;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

/**
 * 方法的練習
 */

public class MethodTest {
    public static void main(String[] args) {
//        int[] array2 = {10, 60, 90, 20, 88};
//        getArrayMax(array2);
//
//        int[] array3 = {888, 999, 484, 712, 10000, 79};
//        getArrayMax(array3);
//
//        int[] array4 = {60, 80, 333, 61};
//        getArrayMax(array4);
//
//
//
//    }
//
//    static int getArrayMax(int[] arr) {
//        int max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
//        return max;

//        int a = 10;
//        int b = 20;
//        //使a、b交換
//
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println(a + "," + b);


//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
//        for (int i = arr.length - 1; i >= 0; i--) {
//            System.out.print(arr[i] + "\t");
//            }

//
//        //實現反序方法
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
//        reversalMethod(arr);
////        //第一元素與倒數第一元素交換
////        int temp1 = arr[0];
////        arr[0] = arr[arr.length - 1];
////        arr[arr.length - 1] = temp1;
////        System.out.println(arr[0] + "," + arr[arr.length - 1]);
////        //第二元素與倒數第二元素交換
////        int temp2 = arr[1];
////        arr[1] = arr[arr.length - 1 - 1];
////        arr[arr.length - 1 - 1] = temp2;
////        System.out.println(arr[1] + "," + arr[arr.length - 1 - 1]);
////        //第三元素與倒數第三元素交換
////        int temp3 = arr[2];
////        arr[2] = arr[arr.length - 1 - 2];
////        arr[arr.length - 1 - 2] = temp3;
////        System.out.println(arr[2] + "," + arr[arr.length - 1 - 2]);
////        //第四元素與倒數第四元素交換
////        int temp4 = arr[3];
////        arr[3] = arr[arr.length - 1 - 3];
////        arr[arr.length - 1 - 3] = temp2;
////        System.out.println(arr[3] + "," + arr[arr.length - 1 - 3]);
////        //觀察上述四步驟，發現重複
//    }
//
//    static void reversalMethod(int[] arr) {
//        for (int i = 0; i <= arr.length / 2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length - 1 - i];
//            arr[arr.length - 1 - i] = temp;
//            //System.out.println(arr[i] + "," + arr[arr.length - 1 - i]);確認每組交換正常
//
//        }
//        for (int i = 0; i <= arr.length-1;i++){
//            System.out.print(arr[i]);}//遍歷
//    operationMethod(10,10,1);
//    operationMethod(20,10,2);
//    operationMethod(10,10,3);
//    operationMethod(20,10,4);
//    operationMethod(20,10,5);
        int s1 = getTotalSecondByMinute(1);
        System.out.println(s1);
        int s2 = getTotalSecondByMinuteHour(1, 1);
        System.out.println(s2);
        int s3 = getTotalSecondByMinuteHourDay(0,0, 1);
        System.out.println(s3);


    }
//    static double operationMethod(int a,int b,int c) {
//        double r = 0;
//        if (c == 1) {
//             r = a + b;
//        } else if (c == 2) {
//             r = a - b;
//        } else if (c == 3) {
//             r = a * b;
//        } else if (c == 4) {
//             r = a / b;
//        } else {
//            System.out.println("代碼輸入不合法");
//        }
//        System.out.println(r);
//        return r ;
//    //另一種寫法

//    static void operationMethod(int a,int b,int c){
//        int r = 0;
//        switch (c){
//            case 1 :
//                r = a+b;
//                break;
//            case 2 :
//                r = a-b;
//                break;
//            case 3 :
//                r = a*b;
//                break;
//            case 4 :
//                r = a/b;
//                break;
//            default:
//                System.out.println("輸入代碼不合法");
//                break;
//        }
//        System.out.println(r);

    //作業I
    static int getTotalSecondByMinute(int mins) {
        int s = mins * 60;
        //System.out.println("經過" + mins + "分鐘等於經過" + s + "秒");

        return s;
    }

    static int getTotalSecondByMinuteHour(int mins, int hrs) {
        //int s = hrs * 60 * 60 + mins * 60;也可以直接調用方法
        //System.out.println("經過" + hrs + "小時" + mins + "分鐘等於經過" + s + "秒");
        int s = getTotalSecondByMinute(mins + hrs * 60);

        return s;
    }

    static int getTotalSecondByMinuteHourDay(int mins, int hrs, int days) {
        //int s = days * 24 * 60 * 60 + hrs * 60 * 60 + mins * 60;也可以再次直接調用方法
        //System.out.println("經過" + days + "天" + hrs + "小時" + mins + "分鐘等於經過" + s + "秒");
        int s = getTotalSecondByMinuteHour(mins, hrs + days * 24);

        return s;
    }
}



