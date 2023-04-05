package src.day00.practicePlaneSystem;

import javax.swing.*;

public class Hero extends FlyingObject {

    //數據
//    double x;
//    double y;
//    double width;
//    double height;

    public void move() {//利用此段空白覆蓋/修改/重寫 父類無參數方法(什麼都不做)
    }

    //方法
    /**
     * 將英雄移動到滑鼠位置
     * @param x 滑鼠位置x
     * @param y 滑鼠位置y
     */
    public void move(int x,int y) {
        this.x = x;
        this.y = y;
    }

    //構造器
    public Hero(double x, double y, double width, double height) {
//        this.x = x;
//        this.y = y;
//        this.width = width;
//        this.height = height;
// 以上已調用父類構造器，直接簡化如下
        super(x,y,width,height);
        this.image = new ImageIcon("src/images/hero0.png");

    }
}
