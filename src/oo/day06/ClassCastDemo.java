package src.oo.day06;

/**
 * 引用類型 強轉語法 演示類
 */
public class ClassCastDemo {
    public static void main(String[] args) {
        A a1 = new B();//向上造型
        if (a1 instanceof B) {
            B b1 = (B) a1;//強轉
        }
        if (a1 instanceof I) {
            I i1 = (I) a1;//強轉
        }
        if (a1 instanceof C) {
            C c1 = (C) a1;
        }
        //ClassCaseException;類型轉換異常
        //引用類型中強轉推薦使用 instanceof 來判斷類型
    }
}

class A{

}
interface I{

}
class B extends A implements I{

}
class C extends A{

}