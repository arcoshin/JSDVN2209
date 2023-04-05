package src.oo.test02;

import src.oo.test01.Aoo;

public class Coo {//非同包類，需導入
    void testAction(){
        Aoo aoo = new Aoo();
        aoo.a = 1;//可訪問
//        aoo.b = 2;//不可訪問，protected : 保護的，訪問權限在 本類、同包類、子類
//        aoo.c = 3;//不可訪問，默認(留空) : 訪問權限在 本類、同包類可訪問
//        aoo.d = 4;//不可訪問，private為私有的，僅同類中可訪問
    }
}
class Doo extends Aoo{//非同包子類
    void testAction(){
        a = 1;
        b = 2;
//        c = 3;//非同包子類無法訪問默認修飾符
//        d = 4;//非同包子類無法訪問私有修飾符
    }

}
