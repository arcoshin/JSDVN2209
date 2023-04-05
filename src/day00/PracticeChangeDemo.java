package src.day00;

public class PracticeChangeDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int[] arr1 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int[] arr2 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int[] arr3 = {1, 4, 7, 2, 5, 8, 3, 6, 9};
        int[] arr4 = {2, 3, 5, 7, 11, 13};
        change(arr);

        change(arr1);

        change(arr2);

        change(arr3);

        change(arr4);

    }

    static void change(int[] arr) {//arr數組最後一項為arr[arr.length-1],因為第一項為arr[0]
        for (int i = 0; i < (arr.length) * 0.5; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        for (int i = 0; i < (arr.length); i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        return;
    }

}
