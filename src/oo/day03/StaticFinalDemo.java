package src.oo.day03;

/**
 * 常量的使用演示類 : 常量命名一般要求全大寫
 */
public class StaticFinalDemo {
    public static void main(String[] args) {
//        Eoo.C = 100;//被final修復的變量不可二次修改
        System.out.println(Eoo.a);//訪問靜態成員
        System.out.println(Eoo.C);//透過類名打點訪問常量
    }
}
class Eoo {
    public static int a;//靜態變量
    public final int b = 10;//final修飾的變量 1.先將Eoo.class字節碼加載到方法區中
//                                          2.訪問方法區中的靜態變量a
    public static final int C = 100;//常量，本質上直接訪問數據，不會訪問類，故不會執行靜態代碼塊

    static {//靜態代碼塊
        System.out.println("Eoo靜態代碼塊已經執行了");
    }
}

