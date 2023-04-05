package src.oo.day02;

public class SuperDemo {
    public static void main(String[] args) {
        Boo b = new Boo();//依照輸出可得知父類構造方法執行完畢後才會執行子類構造方法
    }
}

class Aoo {//創建一個父類
    Aoo(String 輸入參數) {//創建一個Aoo構造方法
        System.out.println(" Aoo 這個有參構造方法執行了.....");
    }
}

class Boo extends Aoo {//創建一個子類
    Boo() {//創建一個Boo構造方法
        /**
         * 子類構造方法開頭有個隱式寫法super();表示自動執行父類中"默認生成並使用"的"無參構造方法"
         * 所以當父類中如 已有有參構造方法，則super();不可再省略，且必須輸入參數方可正常運行
         * Java 規定 super語句必須存在於子類構造方法中的"第一行"，否則報錯
         */
        super("此時參數已不可空白");
        System.out.println(" Boo 這個無參構造方法執行了");
    }
}

