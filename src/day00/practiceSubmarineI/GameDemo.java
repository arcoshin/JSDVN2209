package src.day00.practiceSubmarineI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;


public class GameDemo extends JPanel {
    private Battleship ship = new Battleship();
    private Bomb[] bom = {};
    private SeaObject[] subm = {};
    private SeaObject[] thun = {};

    public static final int WIDTH = 641;
    public static final int HEIGHT = 479;
    public static final int GAME_START = 0;
    public static final int GAME_RUNNING = 1;
    public static final int GAME_OVER = 2;
    public static final int GAME_PAUSE = 3;
    public int currentGameStatus = GAME_START;

    private int score = 0;


    private SeaObject creatSubmarine() {

        int type = (int) (Math.random() * 20);
        if (type < 10) {
            return new ObserverSubmarine();
        } else if (type < 15) {
            return new TorpedoSubmarine();
        } else {
            return new MineSubmarine();
        }
    }

    int SubmarineEnterIndex = 0;

    private void submarineEnterAction() {
        if (SubmarineEnterIndex++ % 40 == 0) {
            SeaObject obj = creatSubmarine();
            subm = Arrays.copyOf(subm, subm.length + 1);
            subm[subm.length - 1] = obj;
        }
    }

    int thunderEnterIndex = 0;

    private void thunderEnterAction() {
        if (thunderEnterIndex++ % 100 == 0) {
            for (int i = 0; i < subm.length; i++) {
                SeaObject obj = subm[i].shootThunder();
                if (obj != null) {
                    thun = Arrays.copyOf(thun, thun.length + 1);
                    thun[thun.length - 1] = obj;
                }
            }
        }
    }

    private void bombEnterAction() {
        Bomb obj = ship.shootBomb();
        bom = Arrays.copyOf(bom, bom.length + 1);
        bom[bom.length - 1] = obj;

    }

    private void bombBangAction() {
        for (int i = 0; i < bom.length; i++) {
            for (int j = 0; j < subm.length; j++) {
                if (bom[i].isLive() && subm[j].isLive() && bom[i].isHit(subm[j])) {
                    bom[i].goDead();
                    subm[j].goDead();
                    if (subm[j] instanceof ScoreSystem) {
                        ScoreSystem s = (ScoreSystem) (subm[j]);
                        score += s.getScore();
                    } else if (subm[j] instanceof LifeSystem) {
                        LifeSystem l = (LifeSystem) (subm[j]);
                        int addScore = l.getLife();
                        ship.setLife(addScore);
                    }
                }
            }
        }
    }

    private void checkGameOver() {
        if (ship.getLife() <= 0) {
            currentGameStatus = GAME_OVER;
        }
    }

    private void thunderBangAction() {
        for (int i = 0; i < thun.length; i++) {
            if (thun[i].isLive() && thun[i].isHit(ship)) {
                thun[i].goDead();
                ship.subtractLife();
                checkGameOver();
            }
        }

    }


    private void moveAction() {
        for (int i = 0; i < subm.length; i++) {
            subm[i].move();
        }
        for (int i = 0; i < thun.length; i++) {
            thun[i].move();
        }
        for (int i = 0; i < bom.length; i++) {
            bom[i].move();
        }
    }

    private SeaObject[] deleteOutOrDeadObjectByArray(SeaObject[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].isOut() || arr[i].isDead()) {
                arr[i] = arr[arr.length - 1];
                arr = Arrays.copyOf(arr, arr.length - 1);
            }
        }
        return arr;
    }

    private void delAction() {
        subm = deleteOutOrDeadObjectByArray(subm);
        thun = deleteOutOrDeadObjectByArray(thun);
        bom = (Bomb[]) deleteOutOrDeadObjectByArray(bom);
    }

    public void action() {
        KeyAdapter adapter = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    if (currentGameStatus == GAME_START){
                        currentGameStatus = GAME_RUNNING;
                    } else {
                        bombEnterAction();
                    }
                } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    ship.moveLeft();
                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    ship.moveRight();
                } else if (e.getKeyCode() == KeyEvent.VK_P) {
                    if(currentGameStatus == GAME_RUNNING){
                        currentGameStatus = GAME_PAUSE;
                    } else if(currentGameStatus == GAME_PAUSE) {
                        currentGameStatus = GAME_RUNNING;
                    }
                } else if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (currentGameStatus == GAME_OVER){
                        currentGameStatus = GAME_START;
                        ship = new Battleship();
                        bom = new Bomb[]{};
                        subm = new SeaObject[]{};
                        thun = new SeaObject[]{};
                        score = 0;
                        repaint();
                    }
                }

                }
            };this.addKeyListener(adapter);



        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if (currentGameStatus == GAME_RUNNING) {
                    submarineEnterAction();
                    thunderEnterAction();
                    repaint();
                    moveAction();
                    delAction();
                    bombBangAction();
                    thunderBangAction();
                }
            }

        };timer.schedule(task, 3000, 10);

    }


    public void paintWorld() {
        //視窗繪製
        JFrame frame = new JFrame();
        this.setFocusable(true);
        frame.add(this);
        frame.setSize(WIDTH + 16, HEIGHT + 38);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void paint(Graphics g) {

        switch (currentGameStatus) {
            case GAME_START:
                PhotoResource.start.paintIcon(null, g, 0, 0);
                break;

            case GAME_RUNNING:
                PhotoResource.bg.paintIcon(null, g, 0, 0);
                ship.paintImage(g);

                for (int i = 0; i < subm.length; i++) {
                    subm[i].paintImage(g);
                }

                for (int i = 0; i < thun.length; i++) {
                    thun[i].paintImage(g);
                }

                for (int i = 0; i < bom.length; i++) {
                    bom[i].paintImage(g);
                }

                g.setFont(new Font("", Font.BOLD, 20));
                g.drawString("SCORE:" + score, 200, 50);
                g.drawString("LIFE:" + ship.getLife(), 400, 50);
                break;

            case GAME_PAUSE:
                break;

            case GAME_OVER:
                PhotoResource.over.paintIcon(null, g, 0, 0);

        }


    }

    public static void main(String[] args) {
        //創建GameDemo對象去調用action，以生成對象總匯
        GameDemo GD = new GameDemo();
        GD.paintWorld();
        GD.action();
    }


}
