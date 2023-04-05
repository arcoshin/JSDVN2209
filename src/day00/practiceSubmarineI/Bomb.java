package src.day00.practiceSubmarineI;

import javax.swing.*;

public class Bomb extends SeaObject {

    Bomb(int x, int y) {
        super(x, y, 9, 11, 3);
    }

    public void move() {
        y += speed;
    }
    public boolean isOut() {
        return this.y > GameDemo.HEIGHT;
    }

    protected ImageIcon getImage() {
        if (isLive()) {
            return PhotoResource.bob;
        }return null;
    }
}
