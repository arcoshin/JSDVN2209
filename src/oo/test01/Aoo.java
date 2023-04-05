package src.oo.test01;

/**
 * 訪問修飾符演示類
 * public : 公開的，任意位置都可訪問，權限最大
 * protected : 保護的，訪問權限在 本類、同包類、子類
 * 默認(留空) : 訪問權限在 本類、同包類可訪問
 * private : 私有的，僅當前類中可訪問，權限最小
 */
public class Aoo {

    public int a;
    protected int b;
    int c;
    private int d;

    void testAction(){
        a = 1;//可訪問
        b = 2;//可訪問
        c = 3;//可訪問
        d = 4;//可訪問
    }

    public void t1() { }
    protected void t2() { }
    void t3(){ }
    private void t4(){ }


}
class Boo{//在test01包下 --->同包類
    void testAction(){
        Aoo aoo = new Aoo();
        aoo.a = 1;//可訪問
        aoo.b = 2;//可訪問
        aoo.c = 3;//可訪問
        //aoo.d = 4;//不可訪問，private為私有的，僅同類中可訪問
    }
}
class Boo1 extends Aoo{// --->同包子類
    void testAction(){
        Aoo aoo = new Aoo();
        aoo.a = 1;//可訪問
        aoo.b = 2;//可訪問
        aoo.c = 3;//可訪問
//        aoo.d = 4;//不可訪問，private為私有的，僅同類中可訪問
    }

}