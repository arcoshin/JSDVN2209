package src.day00.practiceSubmarineI;

import javax.swing.*;

public class Torpedo extends SeaObject {
    Torpedo(int x, int y) {
        super(x,y,5,18,2);

    }

    public void move(){
        y -= speed;
    }
    public boolean isOut() {
        return this.y < -width;
    }

    protected ImageIcon getImage(){
        if (isLive()){
            return PhotoResource.t;
        }return null;
    }
}
