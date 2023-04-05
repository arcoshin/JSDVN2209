package src.cn.tedu.submarine;

import javax.swing.*;

/**
 * 魚雷類
 */

public class Torpedo extends SeaObject{

    //特有屬性(共有屬性已抽取至父類而可刪除，但要記得繼承(extends))
//    int x;
//    int y;
//    int width;
//    int height;
//    int speed;

    //構造器
    Torpedo(int x, int y) {//抽取成父類
        super(5,18,x,y,2);
//        this.x = x;
//        this.y = y;
//        this.width = 5;
//        this.height = 18;
//        this.speed = 2;

    }

//    //行為(共有方法已抽取至父類而可刪除，但要記得繼承(extends))
//    void move(){
//    }
    public void move(){//實現方法重寫
//        System.out.println("魚雷對象實現了y向上運動");
        y -= speed;
    }

    protected ImageIcon getImage(){
        if (isLive()){
            return ImageResource.torpedo;
        }
        return null;
    }

    public boolean isOut(){//魚雷往上全出視窗即出界
        return this.y <= -height;
    }


}
