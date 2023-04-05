package src.day00.practicePlaneSystem;

import javax.swing.ImageIcon;

public class FlyingObject {
    //父類中的共用特性是從子類中抽取的，這種方式稱為"泛化"
    double x;
    double y;
    double width;
    double height;
    double step;
    ImageIcon image;

    //父類構造器，子類不可復用構造器，但可以利用super()調用參數
    public FlyingObject(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    //父類方法
    public void move(){
        y += step;
    }

    @Override//檢驗用
    public String toString() {
        String className = getClass().getName();
        return className+"{" +
                "x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
