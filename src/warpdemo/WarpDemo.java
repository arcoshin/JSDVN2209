package src.warpdemo;

public class WarpDemo {
    public static void main(String[] args) {
        /** 基本數據類型      包裝類
         * byte             Byte
         * short            Short
         * int              Integer
         * long             Long
         * float            Float
         * double           Double
         * char             Character
         * boolean          Boolean
         */

        /** 將包裝類轉為基本數據類型
         *
         */
        Integer i = Integer.valueOf(100);
        int num = i.intValue();
        System.out.println(num);

        Double d = Double.valueOf(3.14);
        double num2 = d.doubleValue();
        System.out.println(num2);//3.14
        double num3 = d.intValue();//intValue()方法內含強轉，故一定可以編譯並運行
        System.out.println(num3);//3.0，強轉完的結果(剩整數位)

        //如何將基本數據類型以包裝類方式儲存
        int number = 100;
        Integer i1 = new Integer(number);
        System.out.println(i1);
        System.out.println(i1.toString());//100(已重寫過)
        Integer i2 = new Integer(number);
        System.out.println(i1 == i2);//false 比的依然是地址(引用類型)
        System.out.println(i1.equals(i2));//true 比的是內容
        Integer i3 = Integer.valueOf(number);//復用
        Integer i4 = Integer.valueOf(100);
        System.out.println(i3 == i4);//復用成立，但只能緩存一個字元(-128~127)
        Integer i5 = Integer.valueOf(128);
        Integer i6 = Integer.valueOf(128);
        System.out.println(i5 == i6);//false，超過一個字節
        Integer i7 = Integer.valueOf(-127);
        Integer i8 = Integer.valueOf(-127);
        System.out.println(i7 == i8);//復用成立
        String str = "888";
        Integer i9 = Integer.parseInt(str);//String轉int
        Integer i0 = Integer.valueOf(str);
        System.out.println(i9);
        System.out.println(i0);
        str = "888，發發發";//(內含非允許字符)運行錯誤，NumberFormatException: 數據格式錯誤。
//        i9 = Integer.parseInt(str);
//        i0 = Integer.valueOf(str);
//        System.out.println(i9);
//        System.out.println(i0);

        Double d1 = Double.valueOf(3.14);
        Double d2 = Double.valueOf(3.14);
        System.out.println(d1 == d2);//false，Double.value無緩存，本質是創建新對象

        //進制轉換
        int base = 10;
        System.out.println(Integer.toBinaryString(base));//1010,轉為二進制
        System.out.println(Integer.toOctalString(base));//12,轉為八進制
        System.out.println(Integer.toHexString(base));//a,轉為16進制

        /**自動拆裝箱*/

        /**
         * 裝箱 : 將基本數據類型 直接賦值給 包裝類的過程
         * */
        int iI = 123;
        /**
         * 實際上字節碼文件中:
         * Integer iInteger = iI;  轉換為  Integer iInteger = Integer.valueOf(iI)
         */
        Integer iInteger = iI;//編譯器支持
        System.out.println(iInteger);
        /**
         * 拆箱 : 將包裝類類型 直接賦值給 基本數據類型的過程
         */
        /**
         * 實際上字傑碼文件中:
         * Int iInt = iInteger;  轉換為  int iInt = iInteger.intValueOf();
         */
        int iInt = iInteger;
        System.out.println(iInt);//編譯器支持
    }
}
