package src.day00.practicePlaneSystem;

import javax.swing.*;

public class Airplane extends FlyingObject {

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
    public Airplane(double x, double y, double width, double height, double step) {
//        this.x = x;
//        this.y = y;
//        this.width = width;
//        this.height = height;
// 以上已調用父類構造器，直接簡化如下
        super(x,y,width,height);
        this.step = step;
        image = new ImageIcon("src/images/airplane0.png");


    }

    public static void main(String[] args) {
        Airplane image = new Airplane(10,10,50,40,1.5);
        System.out.println(image);
        System.out.println(image.image.getImageLoadStatus());
    }
}
