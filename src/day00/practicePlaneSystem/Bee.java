package src.day00.practicePlaneSystem;

import javax.swing.*;

public class Bee extends FlyingObject {

    public Bee(double x, double y, double width, double height, double step){
        super(x,y,width,height);
        this.step = step;
        this.image = new ImageIcon("src/images/bee0.png");
    }

/**
 * 重寫move方法為斜線飛行
 */
    //調用父類方法的演示(super.)
    @Override
    public void move() {
        super.move();//沿用原屬性(向下飛行)
        x++;//新增一個水平方向的屬性

    }
}
