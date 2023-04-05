package src.cn.tedu.submarine;

import javax.swing.*;

/**
 * 戰艦類
 */

public class Battleship extends SeaObject{

    //特有屬性(共有屬性已抽取至父類而可刪除，但要記得繼承(extends))
//    int x;
//    int y;
//    int width;
//    int height;
//    int speed;
    private int life;//戰艦特有 //戰艦的命數
    public int getLife(){//對外提供獲取命數的方法
        return life;
    }
    public void setLife(int life){//對外提供增加命數的方法
        if (life > 0){//如果外部傳入生命值大於0
            this.life += life;//增加生命
        }
    }

    public void subtractLife(){//戰艦減命方法
        life--;
    }

    //構造器
    Battleship() {//只有一個對象，而且初始值固定，直接無參寫死就可以了
        //構造器一般不可私有，但業界使用訪問修飾符時非常不建議默認!!
        super(66,26,270,124,20);//抽取成父類
//        this.x = 270;
//        this.y = 124;
//        this.width = 66;//圖片長度固定...可從圖片檔右鍵內容中，詳細資料欄中去參考
//        this.height = 26;//圖片寬度固定
//        this.speed = 20;
        this.life = 5;
    }
    public void move(){//實現方法重寫，且SeaObject為抽象類，不可刪
//        System.out.println("戰艦實現了左右移動");
    }

//    //行為(共有方法已抽取至父類而可刪除，但要記得繼承(extends))
//    void move(){
//    }

    protected ImageIcon getImage(){//戰艦對象較特殊，一旦死亡即代表遊戲結束

        return ImageResource.battleship;//無條件返回戰艦圖片即可
    }

    public Bomb shootBomb(){
        return new Bomb(x,y);//戰艦在哪，炸彈就由哪生成
    }

    public void moveLeft() {
        if (x > 0){
            x -= speed;
        }else {
            x = 0;
        }
    }
    public void moveRight(){
        if (x < GameWorld.WIDTH - width){
            x += speed;
        }else {
            x = GameWorld.WIDTH - width;
        }
    }


}
