package src.oo.day03;

/**
 *  final 關鍵字演示類
 *  被final修飾的變量，必須於聲明時初始化，之後不可二次修改
 *  被final修飾的方法，不可被子類重寫
 *  被final修飾的不可被繼承
 */
public class FinalDemo {
    private int a;
    public final int b = 10;//被final修飾的變量，必須於聲明時初始化
    final int[] arr = {1,2,3};//被final修飾的變量，必須於聲明時初始化


    public void test(){
        a = 10;
        a = 100;
//        b = 11;//編譯錯誤，被final修飾的變量不可被二次賦值
    }
}

final class Aoo{
    public void show(){
        System.out.println("111");
    }

}

//class Boo extends Aoo{ //被final修飾的類不可被繼承，如 Scanner 類型的 java 功能，可使用不可修改
//    public void show(){
//        System.out.println("222");
        /**
         *  被final修復的方法不可被子類重寫(覆蓋)
         *  一般用於父級代碼，防止竄改
         *  不可重寫但可以重載
         */
//    }
//}