package src.day00.practiceSubmarineII;

import javax.swing.*;

public class T extends AllObjInTwice{
    T(int x,int y){
        super(x,y,5,18,2);
    }

    public void move(){
        y -= speed;
    }

    public ImageIcon getImage(){
        if(isLive()){
            return PictureResource.tor;
        }return null;
    }

    public boolean isOut() {
        return (this.y < 0);
    }
}
