package src.cn.tedu.submarine;

import javax.swing.*;

/**
 * 水雷潛艇類
 */

public class MineSubmarine extends SeaObject implements LifeCalculate{

    //特有屬性(共有屬性已抽取至父類而可刪除，但要記得繼承(extends))
//    int x;
//    int y;
//    int width;
//    int height;
//    int speed;

    //構造器
    MineSubmarine() {//抽取成父類
        super(63,19);
//        this.width = 63;
//        this.height = 19;
//        //要先賦值 width 及 height 否則 x 無法賦值
//        this.x = -width;
//        this.y = (int) (Math.random() * (479-height - 150) + 150);
//        this.speed = (int) (Math.random() * (3 - 1) + 3);
    }

//    //行為(共有方法已抽取至父類而可刪除，但要記得繼承(extends))
//    void move(){
//    }
    public void move(){//實現方法重寫
//        System.out.println("水雷潛艇對象實現了x向右運動");
        x += speed;
    }

    protected ImageIcon getImage(){
        if (isLive()){
            return ImageResource.minesubm;
        }
        return null;
    }

    @Override
    public int getLife() {//方法重寫
        return 1;
    }
}
