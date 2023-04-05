package src.day00.practiceSubmarineII;

import javax.swing.*;

public class PictureResource {
    public static ImageIcon ship;
    public static ImageIcon bomb;
    public static ImageIcon over;
    public static ImageIcon mine;
    public static ImageIcon mineSub;
    public static ImageIcon obsSub;
    public static ImageIcon bg;
    public static ImageIcon start;
    public static ImageIcon tor;
    public static ImageIcon torSub;

    static {
        ship = new ImageIcon("img/battleship.png");
        bomb = new ImageIcon("img/bomb.png");
        over = new ImageIcon("img/gameover.png");
        mine = new ImageIcon("img/mine.png");
        mineSub = new ImageIcon("img/minesubm.png");
        obsSub = new ImageIcon("img/obsersubm.png");
        bg = new ImageIcon("img/sea.png");
        start = new ImageIcon("img/start.png");
        tor = new ImageIcon("img/torpedo.png");
        torSub = new ImageIcon("img/torpesubm.png");
    }
    /**驗證圖片是否成功落取的方法
    public static void main(String[] args) {
        System.out.println(ship.getImageLoadStatus());//8
        System.out.println(bomb.getImageLoadStatus());//8
        System.out.println(over.getImageLoadStatus());//8
        System.out.println(mine.getImageLoadStatus());//8
        System.out.println(mineSub.getImageLoadStatus());//8
        System.out.println(obsSub.getImageLoadStatus());//8
        System.out.println(bg.getImageLoadStatus());//8
        System.out.println(start.getImageLoadStatus());//8
        System.out.println(tor.getImageLoadStatus());//8
        System.out.println(torSub.getImageLoadStatus());//8
    }*/
}
