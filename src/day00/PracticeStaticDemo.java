package src.day00;

import static java.lang.Math.*;


public class PracticeStaticDemo {
    int a;
    static int b;
    String name;
    static double angle;

    void person(String name$) {//方法調用當前對象的變量，不可用static
        this.name = name$;
    }

    void whoru(String name$) {//方法調用當前對象的變量，不可用static
        System.out.println("我叫 : " + this.name);
    }

    static void add(int a, int b) {//方法未調用當前對象的變量，可用static
        System.out.println(a + b);
    }

    static int addReturn(int c, int d) {//方法未調用當前對象的變量，可用static
        int e = c + d;
        return e;
    }


    static {
        System.out.println("初始化angle");
        angle = Math.PI * 2;
    }


    public static void main(String[] args) {

        /**
         * 實例變量 : 每個對象各有一份
         * 靜態變量 : 所有成員共享一份(連動修改)
         */

        PracticeStaticDemo s1 = new PracticeStaticDemo();
        PracticeStaticDemo s2 = new PracticeStaticDemo();
        s1.a = 5;
        s2.a = 9;
        //PracticeStaticDemo.b = 11;
        s1.b = 10;
        System.out.println("s1 = (" + s1.a + "," + s1.b + ")");//(5,10)
        System.out.println("s2 = (" + s2.a + "," + s2.b + ")");//(9,10)

        s2.b = 12;
        System.out.println("s2 = (" + s2.a + "," + s2.b + ")");//(9,12)
        System.out.println("s1 = (" + s1.a + "," + s1.b + ")");//(5,12)

        /**
         * 普通方法 : 有使用當前對象的變量，故需創建一個對象才可以調用屬性
         * 靜態方法 : 未使用當前對象的變量，不需創建對象即可直接打點調用屬性
         * 結論 : 即出現 static 靜態方法時，不再會出現this關鍵字
         * Java 內建的 Math.random()* 以及 main方法 都是靜態方法，所以無法調用當前類型的對象與方法
         */
        //PracticeStaticDemo.person("張三");使用當前變量未創造對象，故無法通過當前類直接調用方法屬性
        //PracticeStaticDemo.whoru("張三");使用當前變量未創造對象，故無法通過當前類直接調用方法屬性
        PracticeStaticDemo.add(1, 2);//直接類名打點調用
        int e = PracticeStaticDemo.addReturn(3, 4);//直接類名打點調用
        System.out.println(e);

        s1.person("張三");//創建對象即可直接調用
        System.out.println(s1.name);
        s1.whoru("張三");//創建對象即可直接調用
        s1.add(1, 2);//對象打點也可直接調用
        int f = s1.addReturn(33, 44);//對象打點也可直接調用
        System.out.println(f);

        /**
         * 代碼塊------現在都放在構造器中自動執行，極少使用
         *
         * class Cell{<---類的起始花括號
         *      int a ;
         *
         *      {<---代碼塊起始花括號
         *
         *      //代碼塊，用以在創建對象的時候執行
         *      a = (int)(Math.random()*8);
         *
         *      }<---代碼塊結束花括號
         *
         * }<---類的結束花括號
         *
         *
         *
         * 靜態代碼塊------在類 加載 期間執行，因為 Java類只加載一次，所以靜態代碼塊也只執行一次
         * 應用 : 故可利用創造一個新對象，讓靜態代碼塊初始化類中的靜態屬性
         * 常用 : 將圖片資源定義為靜態屬性，再利用靜態代碼塊加載圖片文件，初始化靜態屬性屬性
         *  class Cell{<---類的起始花括號
         *      int a ;
         *
         *      static{<---靜態代碼塊起始花括號
         *
         *      a = (int)(Math.random()*8);
         *
         *      }<---代碼塊結束花括號
         *
         * }<---類的結束花括號
         **/

        PracticeStaticDemo angle01 = new PracticeStaticDemo();
        PracticeStaticDemo angle02 = new PracticeStaticDemo();
        System.out.println(PracticeStaticDemo.angle);
        System.out.println(angle01.angle);
        System.out.println(angle02.angle);

        //靜態導入範例
//        System.out.println(Math.sin(Math.toRadians(30)));
//        System.out.println(Math.sin(Math.toRadians(45)));
//        System.out.println(Math.sin(Math.toRadians(60)));
//        System.out.println(Math.sin(Math.toRadians(75)));
//        System.out.println(Math.sin(Math.toRadians(90)));
//        System.out.println(Math.sin(PI / 2));

        //靜態導入java.lang.Math中的所有方法
        //import static java.lang.Math.*

        System.out.println(sin(toRadians(30)));
        System.out.println(sin(toRadians(45)));
        System.out.println(sin(toRadians(60)));
        System.out.println(sin(toRadians(75)));
        System.out.println(sin(toRadians(90)));
        System.out.println(sin(PI / 2));
        //所有的"Math."都可省略，減少代碼冗餘
    }
}