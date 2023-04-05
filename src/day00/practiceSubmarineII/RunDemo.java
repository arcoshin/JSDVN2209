package src.day00.practiceSubmarineII;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

public class RunDemo extends JPanel {
    public static final int WIDTH = 641;
    public static final int HEIGHT = 479;

    private int gameCurrentStatus = GAME_START;
    public static final int GAME_START = 0;
    public static final int GAME_RUNNING = 1;
    public static final int GAME_PAUSE = 2;
    public static final int GAME_OVER = 3;

    private Battleship ship = new Battleship();
    private Bomb bombII[] = {};
    private AllObjInTwice submarineII[] = {};
    private AllObjInTwice thunderII[] = {};

    private int score = 0;

    public void moveAction() {
        for (int i = 0; i < bombII.length; i++) {
            bombII[i].move();
        }
        for (int i = 0; i < submarineII.length; i++) {
            submarineII[i].move();
        }
        for (int i = 0; i < thunderII.length; i++) {
            thunderII[i].move();
        }
    }

    public AllObjInTwice creativeSubmarineII() {
        int r = (int) (Math.random() * 20);
        if (r < 10) {
            return new OSub();
        } else if (r < 15) {
            return new TSub();
        } else {
            return new MSub();
        }
    }

    private int submarineIIEnterIndex = 0;
    public void submarineIIEnterAction() {
        if (submarineIIEnterIndex++ % 80 == 0) {
            AllObjInTwice objS = creativeSubmarineII();
            submarineII = Arrays.copyOf(submarineII, submarineII.length + 1);
            submarineII[submarineII.length - 1] = objS;
        }
    }


    private int thunderIIEnterIndex = 0;
    public void thunderIIEnterAction() {
        if (thunderIIEnterIndex++ % 100 == 0) {
            for (int i = 0; i < submarineII.length; i++) {
                AllObjInTwice objT = submarineII[i].shootThunderII();
                if (objT != null) {
                    thunderII = Arrays.copyOf(thunderII, thunderII.length + 1);
                    thunderII[thunderII.length - 1] = objT;
                }
            }
        }
    }

    public void bombIIEnterAction() {
        Bomb objB = ship.shootBomb();
        bombII = Arrays.copyOf(bombII, bombII.length + 1);
        bombII[bombII.length - 1] = objB;
    }

    public void bombBangAction() {
        for (int i = 0; i < bombII.length; i++) {
            Bomb b = bombII[i];
            for (int j = 0; j < submarineII.length; j++) {
                AllObjInTwice s = submarineII[j];
                if (b.isLive() && s.isLive() && b.isHit(s)) {
                    b.goDead();
                    s.goDead();
                    if (s instanceof ScorePlus) {
                        int addScore = ((ScorePlus) s).addScore();
                        score += addScore;
                    } else if (s instanceof LifePlus) {
                        int addLife = ((LifePlus) s).addLife();
                        ship.setLife(addLife);
                    }
                }
            }
        }
    }

    public void thunderBangAction(){
        for (int i = 0; i < thunderII.length; i++) {
            AllObjInTwice t = thunderII[i];
            if(t.isLive() && t.isHit(ship)){
                t.goDead();
                ship.decreasingLife();
                checkGameCurrentStatus();
            }
        }
    }

    public AllObjInTwice[] deleteMode(AllObjInTwice[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i].isOut()||arrays[i].isDead()){
                arrays[i] = arrays[arrays.length-1];
                arrays = Arrays.copyOf(arrays,arrays.length-1);
            }
        }return arrays;
    }

    public void deleteAction(){
        bombII = (Bomb[]) (deleteMode(bombII));
        submarineII = deleteMode(submarineII);
        thunderII = deleteMode(thunderII);
    }

    public void checkGameCurrentStatus(){
        if (ship.getLife() <= 0){
            gameCurrentStatus = GAME_OVER;
        }
    }

    public void action() {
        KeyAdapter adapter = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    if (gameCurrentStatus == GAME_RUNNING) {
                        bombIIEnterAction();
                    }else if (gameCurrentStatus == GAME_START){
                        gameCurrentStatus = GAME_RUNNING;
                    }else if (gameCurrentStatus == GAME_OVER){
                        gameCurrentStatus = GAME_START;
                        ship = new Battleship();
                        bombII = new Bomb[]{};
                        submarineII = new AllObjInTwice[]{};
                        thunderII = new AllObjInTwice[]{};
                        score = 0;
                        repaint();
                    }
                }else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    ship.moveRight();
                }else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    ship.moveLeft();
                }else if (e.getKeyCode() == KeyEvent.VK_P) {
                    if (gameCurrentStatus == GAME_RUNNING){
                        gameCurrentStatus = GAME_PAUSE;
                    }else if (gameCurrentStatus ==GAME_PAUSE){
                        gameCurrentStatus = GAME_RUNNING;
                    }
                }
            }
        };
        this.addKeyListener(adapter);

        Timer timerII = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if(gameCurrentStatus == GAME_RUNNING){
                    moveAction();
                    submarineIIEnterAction();
                    thunderIIEnterAction();
                    bombBangAction();
                    thunderBangAction();
                    deleteAction();
                    repaint();
                }
            }
        };timerII.schedule(task, 2000, 10);
    }

    public void paintAll() {
        JFrame frame = new JFrame();
        this.setFocusable(true);
        frame.add(this);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH + 16, HEIGHT + 39);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        switch (gameCurrentStatus) {
            case GAME_START:
                PictureResource.start.paintIcon(null,g,0,0);
                break;

            case GAME_RUNNING:
                PictureResource.bg.paintIcon(null, g, 0, 0);
                ship.paintImage(g);
                for (int i = 0; i < bombII.length; i++) {
                    bombII[i].paintImage(g);
                }
                for (int i = 0; i < submarineII.length; i++) {
                    submarineII[i].paintImage(g);
                }
                for (int i = 0; i < thunderII.length; i++) {
                    thunderII[i].paintImage(g);
                }
                g.setFont(new Font("", Font.BOLD, 20));//畫筆的設置字體大小功能
                g.drawString("SCORE:" + score, 200, 50);
                g.drawString("LIFE:" + ship.getLife(), 400, 50);
                repaint();
                break;

            case GAME_OVER:
                PictureResource.over.paintIcon(null,g,0,0);
                break;

            case GAME_PAUSE:
                break;
        }
    }

    public static void main(String[] args) {
        RunDemo runDemo = new RunDemo();
        runDemo.action();
        runDemo.paintAll();
    }
}
