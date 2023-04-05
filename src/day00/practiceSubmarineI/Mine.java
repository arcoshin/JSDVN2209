package src.day00.practiceSubmarineI;

import javax.swing.*;

public class Mine extends SeaObject {
    Mine(int x, int y) {
        super(x, y, 11, 11, 2);

    }

    public void move() {
        y -= speed;
    }

    public boolean isOut() {
        return this.y < 150 - this.height;
    }

    protected ImageIcon getImage() {
        if ((isLive())){
            return PhotoResource.m;
        }return null;
    }
}
