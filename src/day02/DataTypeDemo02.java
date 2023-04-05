package src.day02;

public class DataTypeDemo02 {
    public static void main(String[] args) {

        /**
         * 小數類型
         * double(雙倍精度)浮點數
         * 小數點直接量默認為double類型，也可後綴"D"明確表示類型
         * double類型運算可能存在上下浮動誤差
         * 可以使用"BigDecimal"(引用類型)處理上下浮動的精度問題，本篇不討論(極少使用)
         */

        double a = 3.14;//聲明一個double類型變量名為a，並儲存一個3.14的小數直接量
        double b = 3.0;
        double c = 2.9;
        System.out.println(b-c);//0.10000000000000009，double類型運算結果可能存在誤差

        double d = 6.0;
        double e = 4.9;
        System.out.println(d-e);//1.0999999999999996，double類型運算結果可能上下浮動

        double f = 6.0;
        double g = 1.9;
        System.out.println(f-g);//4.1，double類型運算結果"可能"存在誤差





    }
}
