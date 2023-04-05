package src.oo.day05;

import java.util.Arrays;

/**
 * 數組拷貝使用演示類
 * 第一種 : Arrays.copyOf    ------適合基於當前數組的擴容與縮容
 * 第二種 : System.arrayCopy ------適合兩數組之間的拷貝工作
 */
public class ArrayCopyDemo {
    public static void main(String[] args) {

        //Arrays.copyOf
        int[] arr = {1,2,3};//表示當前數組對象長度為0
        int a = 100;
        System.out.println("實現擴容前arr數組的容量:"+arr.length);
        //copyOf(); 需要兩個參數 : 1.源數組   2.基於源數組的擴容或縮容變化
        arr = Arrays.copyOf(arr,arr.length+1);//相當於重寫
        System.out.println("實現擴容後arr數組的容量:"+arr.length);
        arr[arr.length-1] = a;//寫入最後新擴容的下標空間
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();

        //System.arrayCopy
        /** System.arrayCopy方法需要五個參數
         * 第一項 : 源數組
         * 第二項 : 源數組擷取的起點下標位置
         * 第三項 : 目標數組
         * 第四項 : 在目標數組貼上的起點下標位置
         * 第五項 : 嫁接長度(不可超過目標數組剩餘的長度)
         */
        int[] arr1 = {10,20,30,40};
        int[] arr2 = {0,1,2};
        System.arraycopy(arr1,0,arr2,0,1);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);//10,1,2
        }

        System.arraycopy(arr1,0,arr2,0,2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);//10,20,1
        }

        System.arraycopy(arr1,0,arr2,0,3);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);//10,20,30
        }

//        System.arraycopy(arr1,0,arr2,0,4);//嫁接的賦值長度 不可以超過目標數組長度
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.println(arr2[i]);//10,20,30
//        }


    }

}
