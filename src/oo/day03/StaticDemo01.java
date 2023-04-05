package src.oo.day03;

/**
 * 靜態變量演示類
 */
public class StaticDemo01 {
    public static void main(String[] args) {
        Coo c1 = new Coo();
        c1.show();//(1,1)
        Coo c2 = new Coo();
        c2.show();//(1,2)
        Coo c3 = new Coo();
        c3.show();//(1,3)

        System.out.println(Coo.b);//建議靜態資源都是通過類名打點調用
        Coo.test();//調用類中的靜態方法
    }
}

class Coo {
    public int a;//實例變量，屬於每個對象的，多少對象多少份
    public static int b;//靜態變量，屬於類的，獨一份且被所有對象共享

    Coo() {//構造方法
        a++;
        b++;
    }

    void show() {
        System.out.println("a:" + a + ",b:" + b);

        this.a = 10;//隱式寫法this.
        Coo.b = 20;//隱式寫法Coo.
    }

    public static void test(){//靜態方法沒有隱式this
//        this.a = 1;
//        this.show();
        Coo.b = 10;
    }
}
