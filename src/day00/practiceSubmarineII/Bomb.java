package src.day00.practiceSubmarineII;

import javax.swing.*;

public class Bomb extends AllObjInTwice {
    Bomb(int x, int y) {
        super(x, y, 9, 11, 3);
    }

    public void move() {
        y += speed;
    }

    public ImageIcon getImage() {
        if (isLive()) {
            return PictureResource.bomb;
        }
        return null;
    }

    public boolean isOut() {
        return (this.y > RunDemo.HEIGHT);
    }
}
