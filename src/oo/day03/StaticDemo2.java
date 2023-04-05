package src.oo.day03;

/**
 * 靜態代碼塊使用演示類
 */
public class StaticDemo2 {
    public static void main(String[] args) {
//        System.out.println(Doo.a);//訪問Doo中的靜態成員
//        System.out.println(Doo.a);//訪問成員也算是使用類
        new Doo();

    }
}

class Doo{

    public static int a;
    Doo(){//靜態代碼塊會先於構造方法(同方法區處理，首次訪問即加載)
        System.out.println("Doo的構造方法被執行了");
    }
    static {//靜態代碼塊，當類首次被使用時(包含訪問、調閱、創建)，執行一次
        System.out.println("Doo類的靜態代碼塊被執行了");
    }
}