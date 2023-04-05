package src.day02;

import java.net.NetworkInterface;

/**
 * 數據類型之整數類型相關的範例
 */
public class DataTypeDemo01 {
    public static void main(String[] args) {

        /**
         * int類型
         * 整數的直接量默認為int類型，直接量不可超過當前類型的範圍
         * 100就是直接量
         */

        int a = 100;
        int MAX = Integer.MAX_VALUE;//儲存的直接量為當前類型的最大值
        int MIN = Integer.MIN_VALUE;//儲存的直接量為當前類型的最小值
        System.out.println(MAX);
        System.out.println(MIN);
        //int MAX = 2147483648;//直接量不可超過當前類型的範圍

        int b = 5 ;
        int c = 2 ;
        System.out.println(b/c);//2，整數類型運算結果不會保留小數位

        int d = 2147483647;
        int e = d + 1;//最大值+1 = 最小值
        int f = d + 2;//最大值+2 = 最小值+1
        System.out.println(e);//-2147483648，溢出為最小值，無意義
        System.out.println(f);

        /**
         * int最大值 +1 ----------(-2147483648)
         * int最大值 +2 ----------(-2147483647)
         * int最大值 +3 ----------(-2147483646)
         */

        /**
         * 快捷註釋的方法 : 圈選大面積後，使用 "CTRL" + "/"，即可快速大量註釋
         */

        /**
         * long類型
         */

        long w = 2147483647;//直接量未使用後綴，默認為int類型
//      long x = 2147483648;//long類型的使用，需在直接量最後加上L
        long x = 2147483648L;
        long y = Long.MAX_VALUE;
        long z = Long.MIN_VALUE;
        System.out.println("("+y+"~"+z+")");

                    //十億
        long p = 1000000000 * 2 * 10L;
        System.out.println(p);//200億
        long q = 1000000000 * 3 * 10L;
        System.out.println(q);//溢出的數據(前面默認int的部分已溢出)
        long r = 1000000000L * 3 * 10;
        System.out.println(r);//多位運算時，建議在最前面的直接量添加後綴，後續所有運算都將轉換類型










        }
}
