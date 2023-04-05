package src.day00.practiceSubmarineII;

import javax.swing.*;

public class Mine extends AllObjInTwice{
    Mine(int x,int y){
        super(x,y,11,11,2);
    }

    public void move(){
        y -= speed;
    }

    public ImageIcon getImage(){
        if(isLive()){
            return PictureResource.mine;
        }return null;
    }

    public boolean isOut() {
        return (this.y < 150 - this.height);
    }
}
