package src.cn.tedu.submarine;

import javax.swing.*;

/**
 * 水雷類
 */

public class Mine extends SeaObject{

    //特有屬性(共有屬性已抽取至父類而可刪除，但要記得繼承(extends))
//    int x;
//    int y;
//    int width;
//    int height;
//    int speed;

    //構造器
    Mine(int x, int y) {//抽取成父類
        super(11,11,x,y,2);
//        this.x = x;
//        this.y = y;
//        this.width = 11;
//        this.height = 11;
//        this.speed = 2;
    }

//    //行為(共有方法已抽取至父類而可刪除，但要記得繼承(extends))
//    void move(){
//    }
    public void move(){//實現方法重寫
//        System.out.println("水雷對象實現了y向上移動");
        y -= speed;
    }

    protected ImageIcon getImage(){
        if (isLive()){
            return ImageResource.mine;
        }
        return null;
    }

    public boolean isOut(){//水雷往上全出水面即出界
        return this.y <= 150-height;
    }



}
