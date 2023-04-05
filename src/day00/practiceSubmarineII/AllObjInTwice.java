package src.day00.practiceSubmarineII;

import javax.swing.*;
import java.awt.*;

public abstract class AllObjInTwice {
    protected int x, y, width, height, speed;
    protected int currentStatus = 0;

    protected boolean isLive() {
        return this.currentStatus == 0;
    }

    protected boolean isDead() {
        return this.currentStatus == 1;
    }

    protected boolean isOut(){
        return (this.x > RunDemo.WIDTH);
    }

    protected boolean isHit(AllObjInTwice that) {
        int xL = this.x - that.width;
        int xR = this.x + this.width;
        int yU = this.y - that.height;
        int yD = this.y + this.height;
        int x = that.x;
        int y = that.y;
        return (x >= xL && x <= xR && y <= yD && y >= yU);
    }

    protected void goDead() {
        this.currentStatus = 1;
    }


    public abstract ImageIcon getImage();

    public void paintImage(Graphics g) {
        ImageIcon icon = this.getImage();
        if (this.isLive()) {
            icon.paintIcon(null, g, x, y);
        }
    }

    public AllObjInTwice shootThunderII() {
        int x = this.x + this.width;
        int y = this.y + 5;
        if (this instanceof TSub) {
            return new T(x, y);
        } else if (this instanceof MSub) {
            return new Mine(x, y);
        } else {
            return null;
        }
    }

    AllObjInTwice(int x, int y, int w, int h, int s) {
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
        this.speed = s;
    }

    AllObjInTwice(int w, int h) {
        this.x = -width;
        this.y = (int) (Math.random() * (RunDemo.HEIGHT - height - 150) + 150);
        this.width = w;
        this.height = h;
        this.speed = (int) (Math.random() * (3 - 1) + 1);
    }

    protected abstract void move();

}
