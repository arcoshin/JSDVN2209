package src.day00.practiceSubmarineI;

import javax.swing.*;

public class Battleship extends SeaObject {

    private int life;

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        if (life > 0) {
            this.life += life;
        }
    }

    public void subtractLife() {
        life--;
    }


    Battleship() {
        super(270, 124, 66, 26, 20);
        this.life = 5;
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
        if (x < GameDemo.WIDTH - this.width) {
            x += speed;
        } else {
            x = GameDemo.WIDTH - width;
        }

    }

    protected ImageIcon getImage() {
        return PhotoResource.ship;
    }

    Bomb shootBomb() {
        return new Bomb(x, y);
    }


}
