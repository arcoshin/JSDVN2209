package src.day05;

import javax.crypto.spec.PSource;

/**
 * 數組的演示
 * 1.數組的聲明 : int[] a //聲明一個int類型的數組名為 a
 * <p>
 * 2.數組的初始化(開空間)
 * //靜態開空間 : EX :
 * int[] arr1 = {100,200,300}
 * //使用數組時，知道個數以及內容而直接初始化
 * <p>
 * //動態開空間 : EX : int[] arr2 = new int[3]
 * //開立一個數組，並開闢了三個空間
 * <p>
 * 3.數組的使用(訪問) : 基本 for 動態
 * System.out.println(arr1[0]);//100
 * System.out.println(arr1[1]);//200
 * System.out.println(arr1[2]);//300
 * System.out.println(arr2[0]);//0
 * System.out.println(arr2[1]);//0
 * System.out.println(arr2[2]);//0
 * <p>
 * 4.數組的遍歷 : 從頭到尾訪問一次的過程，稱之為遍歷
 */
public class ArrayDemo {
    public static void main(String[] args) {

        int[] arr1 = {100, 200, 300};
        int[] arr2 = new int[3];

        System.out.println(arr1[0]);//100
        System.out.println(arr1[1]);//200
        System.out.println(arr1[2]);//300
        System.out.println(arr2[0]);//0
        System.out.println(arr2[1]);//0
        System.out.println(arr2[2]);//0
        //System.out.println(arr2[3]);//超出範圍


        arr2[0] = 99;
        System.out.println(arr2[0]);//99
        arr2[1] = 77;
        System.out.println(arr2[1]);//77
        arr2[2] = 66;
        System.out.println(arr2[2]);//66

        int array[] = {10, 50, 45, 99, 63, 88, 54, 30, 15, 66, 45};
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//        System.out.println(array[4]);
//        System.out.println(array[5]);
//        System.out.println(array[6]);
//        System.out.println(array[7]);
//        System.out.println(array[8]);
//        System.out.println(array[9]);
//        System.out.println(array[10]);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();

        //課堂練習 : 1.求和?    2.求最大值?
        int[] array1 = {10, 60, 90, 20, 88};
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];
        }
        System.out.println("1.總合為" + sum);

        int max = array1[0];
        for (int i = 0; i < array1.length; i++) {
            int[] array2 = {10, 60, 90, 20, 88};
            if (max - array2[i] < 0) {
                max = array1[i];
            }
        }
        System.out.println("2.最大值為" + max);


    }
}
