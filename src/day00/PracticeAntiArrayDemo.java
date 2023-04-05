package src.day00;

import javax.crypto.spec.PSource;

public class PracticeAntiArrayDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int[] arr1 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int[] arr2 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int[] arr3 = {1, 4, 7, 2, 5, 8, 3, 6, 9};
        int[] arr4 = {2, 3, 5, 7, 11, 13};

        antiarray(arr);
        antiarray(arr1);
        antiarray(arr2);
        antiarray(arr3);
        antiarray(arr4);


    }

    static void antiarray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();


    }
}
