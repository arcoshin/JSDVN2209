package src.day00.practiceSubmarineII;

import javax.swing.*;

public class TSub extends AllObjInTwice implements ScorePlus{
    TSub() {
        super(64, 20);
    }

    public void move(){
        x += speed;
    }

    public ImageIcon getImage(){
        if(isLive()){
            return PictureResource.torSub;
        }return null;
    }

    @Override
    public int addScore() {
        return 40;
    }
}
