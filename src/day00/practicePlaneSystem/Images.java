package src.day00.practicePlaneSystem;

import javax.swing.*;

public class Images {
    public static ImageIcon[] airplane;
    public static ImageIcon[] bigplane;
    public static ImageIcon[] bee;
    public static ImageIcon bullet;
    public static ImageIcon[] hero;
    public static ImageIcon[] bom;
    public static ImageIcon sky;
    public static ImageIcon start;
    public static ImageIcon pause;
    public static ImageIcon gameover;

    static {
        airplane = new ImageIcon[2];
        airplane[0] = new ImageIcon("/src/images/airplane0.png");
        airplane[1] = new ImageIcon("/src/images/airplane1.png");

        bigplane = new ImageIcon[2];
        bigplane[0] = new ImageIcon("/src/images/bigplane0.png");
        bigplane[1] = new ImageIcon("/src/images/bigplane1.png");

        bee = new ImageIcon[2];
        bee[0] = new ImageIcon("/src/images/bee0.png");
        bee[1] = new ImageIcon("/src/images/bee1.png");

        bullet = new ImageIcon("/src/images/bullet.png");

        hero = new ImageIcon[2];
        hero[0] = new ImageIcon("/src/images/hero0.png");
        hero[1] = new ImageIcon("/src/images/hero1.png");

        bom = new ImageIcon[4];
        bom[0] = new ImageIcon("/src/images/bom1.png");
        bom[1] = new ImageIcon("/src/images/bom2.png");
        bom[2] = new ImageIcon("/src/images/bom3.png");
        bom[3] = new ImageIcon("/src/images/bom4.png");

        sky = new ImageIcon("/src/images/background.png");
        start = new ImageIcon("/src/images/start.png");
        pause = new ImageIcon("/src/images/pause.png");
        gameover = new ImageIcon("/src/images/gameover.png");

    }

    public static void main(String[] args) {
        System.out.println(airplane[0].getImageLoadStatus());
        System.out.println(airplane[1].getImageLoadStatus());
        System.out.println(bigplane[0].getImageLoadStatus());
        System.out.println(bigplane[1].getImageLoadStatus());
        System.out.println(bee[0].getImageLoadStatus());
        System.out.println(bee[1].getImageLoadStatus());
        System.out.println(bullet.getImageLoadStatus());
        System.out.println(hero[0].getImageLoadStatus());
        System.out.println(hero[1].getImageLoadStatus());
        System.out.println(bom[0].getImageLoadStatus());
        System.out.println(bom[1].getImageLoadStatus());
        System.out.println(bom[2].getImageLoadStatus());
        System.out.println(bom[3].getImageLoadStatus());
        System.out.println(sky.getImageLoadStatus());
        System.out.println(start.getImageLoadStatus());
        System.out.println(pause.getImageLoadStatus());
        System.out.println(gameover.getImageLoadStatus());



    }


}
