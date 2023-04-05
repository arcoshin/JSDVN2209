package src.stringdemo;

import javax.swing.*;

/**
 * String類特點的相關演示:
 */
public class StringTest {
    static final String B = "ABC";

    private static ImageIcon map;

    static {//內存圖參考
        map = new ImageIcon("memory map/String.png");
    }

    /**
     * String是引用類型且被final修飾，所以不能被繼承
     * String表象是"字符串"，其實是內部封裝了一個不可修改char數組
     * String拼接並非對原數組進行修改，而是新創一個地址，如下演示
     * String字面量上的賦值，本質上同於創建一個新的對象會自行檢所
     * String會自行檢索有無相同內容的字面輛，紀錄同一個地址
     */
    public static void main(String[] args) {
//        String a = "abc";
//        String b = a;
//        a = a + "456";
//        System.out.println(a);
//        System.out.println(b);
//
//        int[] c = {1, 2, 3};
//        int[] d = c;
//        c[0] = 10;
//        c[1] = 20;
//        c[2] = 30;
//        System.out.println(Arrays.toString(c));
//        System.out.println(Arrays.toString(d));

        //String聲明
        String a = "ABC";
        String b = "ABC";
        String c = "AB" + "C";
        String d = new String("ABC");
        String e = "A";
        String f = e + "BC";


        /**
         * 靜態聲明 String自動檢索常量池並抓取復用
         * 1.字符串字面量
         * 2.字符串常量
         * 3.字符串字面量拼接
         */
        System.out.println(a == b);//true
        System.out.println(a == B && b == B);//true
        System.out.println(a == c && b == c);//true

        /**
         * 動態聲明不可復用相同內容，應盡量避免使用以免佔用內存
         * 1.使用new關鍵字創建的字符串對象
         * 2.使用Spring類型遍量拼接
         */
        System.out.println(d == a);//false
        System.out.println(f == a);//false
    }
}
