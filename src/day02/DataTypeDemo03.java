package src.day02;

import java.sql.SQLOutput;

/**
 * 字符類型(char)範例
 * boolean類型範例
 * 類型轉換使用範例
 * Java規則使用範例
 */
public class DataTypeDemo03 {
    public static void main(String[] args) {

        char temp = 'A';
//      char example = 'abc';只能儲存單個字元
        System.out.println(temp);
        System.out.println( (int) temp);//65

        char temp1 = '\'' ;   // 可以儲存一個 '
        System.out.println(temp1);
        char temp2 = '\"' ;   // 可以儲存一個 "
        System.out.println(temp2);
        char temp3 = '\\' ;   // 可以儲存一個\
        System.out.println(temp3);


/**
 * boolean類型只能儲存一個值(True / False)
 */
        boolean k = 2 >= 2;
        System.out.println(k);//True
        boolean l = false;
        System.out.println(l);//false

/**
 * 轉換
 */
        int a = 100;
        long b = a;
        double c = b;
        System.out.println(c);//100.0

        long d = 2222222222L;
        int e = (int)d;
        System.out.println(e);//溢出

        double f = 3.1415926;
        int g = (int)f;
        System.out.println(g);//3

        byte p = 127;
        short q = 10000;
        char r = 65535;
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);

        //byte、short、char運算時自動轉換為 int 類型
        byte x = 10;
        byte y = 100;
        //byte z = x + y;類型錯誤，byte運算時自動轉換為 int 類型
        byte z = (byte)(x + y);//可以對整個運算結果強轉換
        int z1 = x + y;

        char t1 = 'A';//65
        char t2 = 'A';//65
        int t3 = t1 + t2;
        char t4 = (char)(t1+t2);
        System.out.println(t1);//A
        System.out.println(t2);//A
        System.out.println(t3);//130
        System.out.println(t4);//,

        byte k1 = 10;
        short k2 = 20;
        int k3 = 30;
        int k4 = k1 + k2 + k3;
        System.out.println(k4);














    }
}
