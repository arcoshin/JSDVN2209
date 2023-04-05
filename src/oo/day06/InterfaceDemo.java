package src.oo.day06;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * 接口使用演示類 :
 *
 * 接口類是一種引用數據類型
 * 接口類通過interface來定義，implements來調用
 * 接口類默認為抽象類，故不可創建對象
 * 接口類僅可存放常量及抽象方法
 */
public class InterfaceDemo {
    public static void main(String[] args) {

    }
}

interface Inter{//定義了一個接口，其名稱為Inter
    public static final int NUM = 5;//常量
    public abstract void show();//抽象方法
    //int number;編譯錯誤，接口不能包含變量，默認為常量需初始化
    int number = 20;//默認為  public static final int number
    //void show1(){"方法體"};編譯錯誤，接口內的方法默認為抽象方法，不可有方法體
    void showDefault();//默認為public abstract void show1();
}


interface InterI{
    void showI();
}

interface InterII extends Inter,InterI{//一接口
    void showII();
}


class SuperDemo {//父類
    void showDad(){};
}

class Aoo implements InterII{
    @Override
    public void show() {

    }

    @Override
    public void showDefault() {

    }

    @Override
    public void showI() {

    }

    @Override
    public void showII() {

    }//同時繼承並且接口
    /**
     * 實現接口
     * 抽象方法需重寫，否則空類體會報錯
     * 實現重寫快捷鍵 ALT + ENTER + ENTER
     * 同時有繼承與接口需求，先繼承後實現
     * 可以多重接口，利用逗號連續輸入即可
     * 接口類之間可以互相繼承，並且可以多重繼承
     */

}
/**
 * 子類   繼承  父類
 * 實踐類 接口  接口
 */
