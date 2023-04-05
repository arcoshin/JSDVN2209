package src.day00.practiceSubmarineI;

import javax.swing.*;

public class TorpedoSubmarine extends SeaObject implements ScoreSystem{
    TorpedoSubmarine() {
        super(64, 20);
    }

    public void move() {
        x += speed;
    }

    protected ImageIcon getImage(){
        if (isLive()){
            return PhotoResource.ts;
        }return null;

    }

    @Override
    public int getScore() {
        return 40;
    }
}
