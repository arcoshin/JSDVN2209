package src.oo.day04;

/**
 * 一般內部類使用演示(少使用)
 */

public class InnerClassDemo {
    public static void main(String[] args) {
        //Boo b = new Boo();//外部類以外的類皆無法訪問其內部類
    }
}

class  Aoo{//外部類
    private int a;//私有的成員變量
    private int b;
    void test1(){
        Boo b = new Boo();//外部類可以創建內部類對象
        //System.out.println(b.c);外部類無法訪問內部類私有成員
    }

    class Boo{//內部類
        private int a;//與外部類同名變量不衝突(局部變量範圍向上找花括號)
        private int c;
        void test(int a,int b){
            this.a = 10;//內部類共享外部類成員(包含私有)
            Aoo.this.a = 10;//內外部類變量名衝突時，可使用外部類.+this
            b = 10;//內部類共享外部類成員
        }
    }

}