package src.day00.practiceSubmarineI;

import javax.swing.*;
import java.awt.*;

public abstract class SeaObject {

    protected int x, y, width, height, speed;
    protected static final int LIVE = 0;
    protected static final int DEAD = 1;
    protected int currentStatus = LIVE;

    SeaObject(int x, int y, int width, int height, int speed) {//戰艦、炸彈、水雷、魚雷
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = speed;
    }

    SeaObject(int width, int height) {//各種潛艇
        x = -width;
        y = (int) (Math.random() * (GameDemo.HEIGHT - height - 150) + 150);
        this.width = width;
        this.height = height;
        speed = (int) (Math.random() * (3 - 1) + 1);
    }

    protected abstract void move();

    public boolean isLive(){
        return currentStatus == LIVE;
    }

    public boolean isDead(){
        return currentStatus == DEAD;
    }

    public boolean isOut() {
        return this.x > GameDemo.WIDTH - this.width;
    }

    public boolean isHit(SeaObject that) {
        int xi = this.x - that.width;
        int xf = this.x + this.width;
        int yi = this.y - that.height;
        int yf = this.y + this.height;
        int x = that.x;
        int y = that.y;

        return (x >= xi && x <= xf) && (y >= yi && y <= yf);
    }

    public void goDead(){
        this.currentStatus = DEAD;
    }


    protected abstract ImageIcon getImage();

    public void paintImage(Graphics g) {
        ImageIcon Ob = this.getImage();
        if (Ob != null){
            Ob.paintIcon(null, g, this.x, this.y);
        }

    }

    public SeaObject shootThunder() {
        int x = this.x + this.width;
        int y = this.y - 5;
        if (this instanceof MineSubmarine) {
            return new Mine(x, y);
        } else if (this instanceof TorpedoSubmarine) {
            return new Torpedo(x, y);
        } else {
            return null;
        }
    }

}

