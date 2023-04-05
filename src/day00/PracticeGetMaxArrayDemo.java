package src.day00;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class PracticeGetMaxArrayDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int[] arr1 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int[] arr2 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int[] arr3 = {1, 4, 7, 2, 5, 8, 3, 6, 9};
        int[] arr4 = {2, 3, 5, 7, 11, 13};

        getMAX(arr);
        getMAX(arr1);
        getMAX(arr2);
        getMAX(arr3);
        getMAX(arr4);

    }

    static void getMAX(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }

        }
        System.out.println(max);
    }
}
