package src.cn.tedu.submarine;

import javax.swing.*;

/**
 * 項目圖片資源加載類
 */
public class ImageResource {
    //ImageIcon 用來儲存圖片的類型
    public static ImageIcon battleship;
    public static ImageIcon bomb;
    public static ImageIcon gameover;
    public static ImageIcon mine;
    public static ImageIcon minesubm;
    public static ImageIcon obsersubm;
    public static ImageIcon sea;
    public static ImageIcon start;
    public static ImageIcon torpedo;
    public static ImageIcon torpesubm;
    public static ImageIcon ship;

    static {//靜態代碼塊初始化圖片資源
        battleship = new ImageIcon("img/battleship.png");
        bomb = new ImageIcon("img/bomb.png");
        gameover = new ImageIcon("img/gameover.png");
        mine = new ImageIcon("img/mine.png");
        minesubm = new ImageIcon("img/minesubm.png");
        obsersubm = new ImageIcon("img/obsersubm.png");
        sea = new ImageIcon("img/sea.png");
        start = new ImageIcon("img/start.png");
        torpedo = new ImageIcon("img/torpedo.png");
        torpesubm = new ImageIcon("img/torpesubm.png");
    }

//    public static void main(String[] args) {//測試圖片是否正常加載用(=8)
//        System.out.println(battleship.getImageLoadStatus());
//        System.out.println(bomb.getImageLoadStatus());
//        System.out.println(gameover.getImageLoadStatus());
//        System.out.println(mine.getImageLoadStatus());
//        System.out.println(minesubm.getImageLoadStatus());
//        System.out.println(obsersubm.getImageLoadStatus());
//        System.out.println(sea.getImageLoadStatus());
//        System.out.println(start.getImageLoadStatus());
//        System.out.println(torpedo.getImageLoadStatus());
//        System.out.println(torpesubm.getImageLoadStatus());
//    }
}
