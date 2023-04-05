package src.cn.tedu.submarine;

import javax.swing.*;
import java.awt.*;

/**
 * 海洋對象類，定義為當前七個模板類的父類
 * 用以存放共有的數據以及行為
 */

public abstract class SeaObject {
    protected static final int LIVE = 0;//生存的狀態
    protected static final int DEAD = 1;//死亡的狀態

    protected int currentStatus = LIVE;//默認初始化是活的

    //共有屬性
    //protected 一般用在父類屬性(支援不同包子類訪問)
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected int speed;

    //共有行為
    protected boolean isLive() {
        return this.currentStatus == LIVE;
    }

    protected boolean isDead(){
        return this.currentStatus == DEAD;
    }



    /**
     * 發射魚雷的方法 : 該方法由潛艇對象調用
     * 魚雷潛艇對象調用方法 則返回魚雷對象
     * 水雷潛艇對象調用方法 則返回水雷對象
     * 偵查潛艇對象調用方法 則返回null即可
     */
    public SeaObject shootThunder() {//發射雷的方法
        int x = this.x + this.width;//雷的x
        int y = this.y - 5;//雷的y
        //instanceof 關鍵字 : 用來判斷是否屬於某個類型的語法
        if (this instanceof TorpedoSubmarine) {
            return new Torpedo(x, y);//返回魚雷對象
        } else if (this instanceof MineSubmarine) {
            return new Mine(x, y);//返回水雷對象
        } else {
            return null;
        }
    }

    public boolean isOut() {//所有潛艇類共用，雷類不影響
        return this.x >= GameWorld.WIDTH;//所有潛艇向右全出視窗即出界
    }

    public boolean isHit(SeaObject other) {//父類碰撞邏輯方法
        int x1 = this.x - other.width;
        int x2 = this.x + this.width;
        int y1 = this.y - other.height;
        int y2 = this.y + this.height;
        int x = other.x;
        int y = other.y;

        return (x >= x1 && x <= x2) && (y >= y1 && y <= y2);

    }

    public void goDead(){
        this.currentStatus = DEAD;//修改當前狀態
    }

    protected abstract void move(); //{
//        System.out.println("海洋對象在移動");
//    }

    /**
     * 所有子類都已經重寫此方法，而此方法完全無法被子類所用，應做成抽象方法!
     * 抽象方法 : 被abstract修飾的方法
     * 抽象方法必須存在於抽象類，否則報錯
     * 抽象類 : 被abstract修飾的類，且抽象類不允許創建對象
     * 抽象方法不可以有方法體(連同花括弧刪除)
     * 抽象方法下的所有子類必須實現重寫，否則報錯(理由承上)
     * 抽象類雖不可創建對象，但仍可創建數組對象
     */

    protected abstract ImageIcon getImage();//從子類抽取而來的繪圖
    public void paintImage(Graphics g) {
        ImageIcon icon = this.getImage();//獲取當前對象的圖片
        if (icon != null) {//如果圖片不為空(非死亡)
            icon.paintIcon(null, g, this.x, this.y);//根據當前對象的座標生成
        }

    }

    SeaObject(int width_, int height_) {//超類Type I : 適用潛艇類
        this.width = width_;
        this.height = height_;
        this.x = -width_;
        this.y = (int) (Math.random() * (GameWorld.HEIGHT - height - 150) + 150);
        this.speed = (int) (Math.random() * (3 - 1) + 3);
    }

    SeaObject(int width_, int height_, int x_, int y_, int speed_) {//超類Type II : 適用戰艦類、魚雷、水雷
        this.x = x_;
        this.y = y_;
        this.width = width_;
        this.height = height_;
        this.speed = speed_;
    }

}
