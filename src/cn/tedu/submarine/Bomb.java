package src.cn.tedu.submarine;

import javax.swing.*;

/**
 * 深水炸彈類
 */

public class Bomb extends SeaObject{

    //特有屬性(共有屬性已抽取至父類而可刪除，但要記得繼承(extends))
//    int x;
//    int y;
//    int width;
//    int height;
//    int speed;

    //構造器
    Bomb(int x, int y) {//抽取成父類
        super(9,11,x,y,3);
//        this.x = x;
//        this.y = y;
//        this.width = 9;//圖片長度固定
//        this.height = 11;//圖片寬度固定
//        this.speed = 3;
    }

//    //行為(共有方法已抽取至父類而可刪除，但要記得繼承(extends))
//    void move(){
//    }
    public void move(){//實現方法重寫
//        System.out.println("深水炸彈對象實現了y向上移動\"");
        y += speed;
    }

    protected ImageIcon getImage(){
        if (isLive()){
            return ImageResource.bomb;
        }
        return null;
    }

    public boolean isOut(){//深水炸彈往下全出視窗即出界
        return this.y >= GameWorld.HEIGHT;
    }


}
