package src.day03;

/**
 * 數學運算符號
 * 自增自減運算符
 */
public class OperationDemo01 {
    public static void main(String[] args) {
        //數學運算符
        int a = 10;
        int b = 5;
        int c = a + b;//需要運算並接收結果
        System.out.println(c);//15
        System.out.println(a + b);//15
        System.out.println(a - b);//5
        System.out.println(a * b);//50
        System.out.println(a / b);//2
        System.out.println(a % b);//0，取餘數
        System.out.println(5 % 2);//1，取餘數

        //取餘操作，可用以判斷奇偶數
        //取餘操作時，若是前項數據小於右項，其輸出結果即左項本身。
        System.out.println(1 % 3);//1
        System.out.println(2 % 3);//2
        System.out.println(3 % 3);//0
        System.out.println(4 % 3);//1
        System.out.println(5 % 3);//2
        System.out.println(6 % 3);//0
        System.out.println(7 % 3);//1

        //整理代碼快捷鍵 "CTRL"+"ALT"+"L"

        //自增自檢運算
        //單獨運算時，符號在前在後不影響計算

        int a1 = 5;
        ++a1;//a=a+1
        System.out.println(a1);
        int a2 = 7;
        a1--;//a=a-1
        System.out.println(a2);

        //參與運算時，符號在後，先處理其他運算(包含賦值)後才自增或自減
        //參與運算時，符號在前，先自增或自減後才處理其他運算(包含賦值)

        int b1 = 5;
        int b2 = 5;
        int b3 = b1++;//先對b3賦值後b1自增重新對自己賦值
        int b4 = ++b2;//b2先自增後再對b4賦值
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        int n1 = 5;
        int n2 = 5;
        int n3 = --n1 - n2--;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        //面試題；考察自增或自減底層的執行邏輯

        int p = 1;
        p = p++;
        System.out.println(p);//1

        /** 符號在後:
         *  1.先將變量中的內容 賦值 給臨時變量來儲存   temp = p
         *  2.再進行自增                          p = p + 1
         *  3.再將臨時變量賦值給p                   p = temp
         */

        int q = 1;
        q = ++q;
        System.out.println(q);//2

        /** 符號在前:
         *  1.先將變量進行自增                     q = q + 1
         *  2.再將變量中的內容 賦值 給臨時變量來儲存   temp = q
         *  3.再將臨時變量賦值給q                  q = temp
         */

    }
}


