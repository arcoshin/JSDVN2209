package src.day00.practiceSubmarineII;

import javax.swing.*;

public class OSub extends AllObjInTwice implements ScorePlus{
    OSub() {
        super(63, 19);
    }

    public void move(){
        x += speed;
    }

    public ImageIcon getImage(){
        if(isLive()){
            return PictureResource.obsSub;
        }return null;
    }

    @Override
    public int addScore() {
        return 10;
    }
}
