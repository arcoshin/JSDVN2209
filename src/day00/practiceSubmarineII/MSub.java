package src.day00.practiceSubmarineII;

import javax.swing.*;

public class MSub extends AllObjInTwice implements LifePlus{
    MSub() {
        super(63, 19);
    }

    public void move(){
        x += speed;
    }

    public ImageIcon getImage(){
        if(isLive()){
            return PictureResource.mineSub;
        }return null;
    }

    @Override
    public int addLife() {
        return 1;
    }
}
