package src.day00.practicePlaneSystem;

import javax.swing.*;

public class Sky extends FlyingObject {

    //數據
//    double x;
//    double y;
//    double width;
//    double height;
//    double step;//移動的距離(只作用於y)，連同move方法抽取至父類後刪除
    //方法
//    已寫入父類，可刪除
//    public void move(){
//        y += step;
//    }

    //構造器
    public Sky(double x, double y, double width, double height, double step) {
//        this.x = x;
//        this.y = y;
//        this.width = width;
//        this.height = height;
// 以上已調用父類構造器，直接簡化如下
        super(x,y,width,height);
        this.step = step;
        this.image = new ImageIcon("src/images/background.png");
    }
}
