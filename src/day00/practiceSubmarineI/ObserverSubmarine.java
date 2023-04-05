package src.day00.practiceSubmarineI;

import javax.swing.*;

public class ObserverSubmarine extends SeaObject implements ScoreSystem{
    ObserverSubmarine() {
        super(63, 19);
    }

    public void move() {
        x += speed;
    }

    protected ImageIcon getImage(){
        if (isLive()){
            return PhotoResource.os;
        }
        return null;
    }

    @Override
    public int getScore() {
        return 10;
    }
}
