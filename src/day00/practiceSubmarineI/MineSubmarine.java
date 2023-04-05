package src.day00.practiceSubmarineI;

import javax.swing.*;

public class MineSubmarine extends SeaObject implements LifeSystem{

    MineSubmarine() {
        super(63, 19);
    }

    public void move() {
        x += speed;
    }

    protected ImageIcon getImage() {
        if(isLive()){
            return PhotoResource.ms;
        }return null;
    }

    @Override
    public int getLife() {
        return 1;
    }
}
