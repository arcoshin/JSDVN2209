package src.day00.practiceSubmarineII;

import javax.swing.*;

public class Battleship extends AllObjInTwice {
    private int life;

    public void setLife(int addLife) {
        if (addLife > 0 && this.life > 0){
            this.life += addLife;
        }
    }

    public int getLife() {
        return this.life;
    }

    public void decreasingLife(){
        this.life--;
    }

    Battleship() {
        super(270, 124, 66, 26, 20);
        life = 5;
    }

    public void move() {
    }

    public void moveLeft() {

        if (x > 0) {
            x -= speed;
        } else {
            x = 0;
        }
    }

    public void moveRight() {
        if (x < RunDemo.WIDTH - width) {
            x += speed;
        } else {
            x = RunDemo.WIDTH - width;
        }
    }

    public ImageIcon getImage() {
        return PictureResource.ship;
    }

    public Bomb shootBomb() {
        return new Bomb(x, y);
    }

}
