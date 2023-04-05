package src.cn.tedu.submarine;

import javax.swing.*;
import java.awt.*;

import java.util.Arrays;
import java.util.Timer;//導入計時器類(使用內建schedule的執行功能)
import java.util.TimerTask;//導入任務模板類(為抽象類，搭配匿名內部類使用)

import java.awt.event.KeyAdapter;//鍵盤偵聽器
import java.awt.event.KeyEvent;//鍵盤事件

/**
 * 遊戲入口類
 */

public class GameWorld extends JPanel {//繼承畫板功能，相當於讓自身成為底板
    //聲明變量而不初始化的原因在於對象總數未知
    public static final int WIDTH = 641;//視窗寬度
    public static final int HEIGHT = 479;//視窗高度

    //遊戲狀態
    public static final int GAME_START = 0;//遊戲開始狀態
    public static final int GAME_RUNNING = 1;//遊戲運行狀態
    public static final int GAME_OVER = 2;//遊戲結束狀態
    public static final int GAME_PAUSE = 3;
    public int currentGameStatus = GAME_START;//遊戲默認狀態就是開始狀態

    //對象
    private Battleship ship = new Battleship();
    private Bomb[] bombs = {};
    //    MineSubmarine[] ms;
//    TorpedoSubmarine[] ts;
//    ObserverSubmarine[] os;
//    Mine[] m;
//    Torpedo[] t;
    private SeaObject[] submarines = {};//此數組用來儲存所有的潛艇對象
    private SeaObject[] thunders = {};//此數組用來儲存所有的雷對象

    private int score = 0;//用以記錄分數的變量
    /**
     * 生成潛艇對象的方法---
     * 返回父類(SeaObject)則可以兼容創建偵查、魚雷、水雷潛艇
     */
    private SeaObject creatSubmarine() {
        /**
         * 1.隨機生成0~20之間的數
         * 2.如果隨機數 < 10 ; return 偵查潛艇對象
         *   否則 如果產生的隨機數 < 15 ; return 魚雷潛艇對象
         *   否則 return 水雷潛艇對象
         */
        int r = (int) (Math.random() * 20);
        if (r < 10) {
            return new ObserverSubmarine();
        } else if (r < 15) {
            return new TorpedoSubmarine();
        } else {
            return new MineSubmarine();
        }
    }

    private int submarineEnterIndex = 0;//控制潛艇產生速度

    /**
     * 潛艇入場的方法 : 將方法放在run中調用
     */
    private void submarineEnterAction() {
        /**
         *  調用生成潛艇對象的方法並接收潛艇對象
         *  將潛艇數組擴容1容量
         *  將潛體對象賦值給潛艇數組擴容後的空間
         */
        submarineEnterIndex++;//每10毫秒自增一次
        if (submarineEnterIndex % 40 == 0) {

            SeaObject obj = creatSubmarine();
            submarines = Arrays.copyOf(submarines, submarines.length + 1);
            submarines[submarines.length - 1] = obj;
        }
    }

    private int thunderEnterIndex = 0;//控制雷產生速度

    /**
     * 雷入場的方法 : 將方法放在run中調用
     */
    private void thunderEnterAction() {
        /**
         *  遍歷潛艇數組並調用生成雷的方法，接收雷對象
         *  在循環判斷後接收到的雷對象是否為null
         *  若不為null則將雷數組擴容1容量，並將雷對象賦值到擴容的區域
         */
        thunderEnterIndex++;//每10秒自增一次
        if (thunderEnterIndex % 100 == 0) {//條件滿足則表示已過去1秒
            for (int i = 0; i < submarines.length; i++) {
                SeaObject obj = submarines[i].shootThunder();
                if (obj != null) {
                    thunders = Arrays.copyOf(thunders, thunders.length + 1);
                    thunders[thunders.length - 1] = obj;
                }
            }
        }
    }

    /**
     * 移動的方法------
     * 遍歷潛艇數組每個對象並調用move方法
     * 遍歷雷數組每個對象並調用move方法
     * 遍歷炸彈數組每個對象並調用move方法
     */
    private void moveAction() {
        for (int i = 0; i < submarines.length; i++) {
            submarines[i].move();
        }

        for (int i = 0; i < thunders.length; i++) {
            thunders[i].move();
        }

        for (int i = 0; i < bombs.length; i++) {
            bombs[i].move();
        }
    }

    private void bombEnterAction() {
        /**調用深水炸彈對象的方法，接收深水炸彈對象
         * 為深水炸彈數組bombs擴1容量
         * 將深水炸彈對象賦值給擴容的空間中
         */
        Bomb obj = ship.shootBomb();
        bombs = Arrays.copyOf(bombs, bombs.length + 1);
        bombs[bombs.length - 1] = obj;
    }
    private SeaObject[] deleteOutOrDeadObjectByArray(SeaObject[] arr){
        for (int i = 0; i < arr.length; i++) {//循環遍歷數組以調用方法
            if (arr[i].isOut() || arr[i].isDead()) {//if(調用各自判定出界方法，為true則執行)
                arr[i] = arr[arr.length - 1];//將該數組中最後一個對象 賦值 給當前越界對象
                arr = Arrays.copyOf(arr, arr.length - 1);//通過Arrays.copyOf方法實現尾部縮容

            }
        }return arr;
    }
    private void deleteWhoIsOut() {
        /**
         * 循環遍歷潛艇、雷、炸彈數組，if(調用各自判定出界方法)
         * 如果if條件式為true
         * 將該數組中最後一個對象 賦值 給當前越界對象
         * 通過Arrays.copyOf方法實現尾部縮容
         */
        submarines = deleteOutOrDeadObjectByArray(submarines);
        thunders = deleteOutOrDeadObjectByArray(thunders);
        bombs = (Bomb[]) deleteOutOrDeadObjectByArray(bombs);//深水炸彈未向上造型，要強轉

//        for (int i = 0; i < submarines.length; i++) {//循環遍歷數組以調用方法
//            if (submarines[i].isOut() || submarines[i].isDead()) {//if(調用各自判定出界方法，為true則執行)
//                submarines[i] = submarines[submarines.length - 1];//將該數組中最後一個對象 賦值 給當前越界對象
//                submarines = Arrays.copyOf(submarines, submarines.length - 1);//通過Arrays.copyOf方法實現尾部縮容
//            }
//        }
//
//        for (int i = 0; i < thunders.length; i++) {
//            if (thunders[i].isOut() || thunders[i].isDead()) {
//                thunders[i] = thunders[thunders.length - 1];
//                thunders = Arrays.copyOf(thunders, thunders.length - 1);
//            }
//        }
//
//        for (int i = 0; i < bombs.length; i++) {
//            if (bombs[i].isOut() || bombs[i].isDead()) {
//                bombs[i] = bombs[bombs.length - 1];
//                bombs = Arrays.copyOf(bombs, bombs.length - 1);
//            }
//        }
    }

    /**
     * 深水炸彈與潛艇的碰撞邏輯實現
     */
    private void bombBangAction() {
        for (int i = 0; i < bombs.length; i++) {
            Bomb b = bombs[i];
            for (int j = 0; j < submarines.length; j++) {
                SeaObject s = submarines[j];
                if (b.isLive() && s.isLive() && b.isHit(s)) {
                    b.goDead();
                    s.goDead();
//                    if(submarines[j] instanceof ObserverSubmarine){....................//過度冗長與重複
//                        ObserverSubmarine obj = (ObserverSubmarine) submarines[j];
//                        score += obj.getScore();
//                    }else if (submarines[j] instanceof TorpedoSubmarine){
//                        TorpedoSubmarine obj = (TorpedoSubmarine) submarines[j];
//                        score += obj.getScore();
//                    }else if (submarines[j] instanceof MineSubmarine) {
//                        MineSubmarine obj = (MineSubmarine) submarines[j];
//                        int life = obj.getLife();
//                        ship.setLife(life);
//                    }...................//應該盡可能依賴抽象，不要過度找具體的實現，擴展性很差
                    if (submarines[j] instanceof ScoreCalculate){//判斷當前對象是否實現加分(行為)接口
                        ScoreCalculate obj = (ScoreCalculate) submarines[j];
                        score += obj.getScore();//調父執行子
                    }else if (submarines[j] instanceof LifeCalculate){//判斷當前對象是否實現加命(行為)接口
                        LifeCalculate obj = (LifeCalculate) submarines[j];
                        int life = obj.getLife();//調父執行子
                        ship.setLife(life);
                    }
                }
            }
        }
    }

    /**
     * 雷與戰艦的碰撞邏輯實現
     */
    private void thunderBangAction() {
        for (int i = 0; i < thunders.length; i++) {
            SeaObject t = thunders[i];
            if(t.isLive() && t.isHit(ship)) {
                t.goDead();
                ship.subtractLife();//戰艦減命
                checkGameOver();//每次減命後接著檢查遊戲狀態
            }
        }
    }

    private void checkGameOver(){
        if (ship.getLife() <= 0){
            currentGameStatus = GAME_OVER;//切換遊戲為結束狀態
        }
    }

    private void action() {
        KeyAdapter adapter = new KeyAdapter() {//創建鍵盤偵聽對象---匿名內部類
            public void keyPressed(KeyEvent e) {//該方法代表是按下鍵盤時要發生的事
//               System.out.println("按下了鍵盤建");
                /**
                 * e.getKeyCode();運行時獲取用戶按下的按鍵碼
                 * KeyEvent.VK_SPACE;鍵盤的空白鍵按鍵碼
                 * 設定條件只有當按下的按鍵按鍵碼符合空白鍵按鍵碼，才會調用方法
                 * 即空白鍵才能調用方法讓深水炸彈入場
                 */
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                   if (currentGameStatus == GAME_START) {
                       currentGameStatus = GAME_RUNNING;
                   } else {
                       bombEnterAction();//調用炸彈入場
                   }
                } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
//                   System.out.println("戰艦左移");
                    ship.moveLeft();
                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
//                   System.out.println("戰艦右移");
                    ship.moveRight();
                } else if (e.getKeyCode() == KeyEvent.VK_P) {
                    if(currentGameStatus == GAME_RUNNING) {
                        currentGameStatus = GAME_PAUSE;
                    } else if(currentGameStatus == GAME_PAUSE) {
                        currentGameStatus = GAME_RUNNING;
                    }
                } else if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (currentGameStatus == GAME_OVER){
                        currentGameStatus = GAME_START;
                        ship = new Battleship();
                        bombs = new Bomb[]{};
                        submarines = new SeaObject[]{};
                        thunders = new SeaObject[]{};
                        score = 0;
                        repaint();
                    }
                }
            }
        };this.addKeyListener(adapter);//添加鍵盤偵聽對象
//        System.out.println("通過當前類對象的形式，調用action方法");
//        //使用有參構造器快速生成對象
//        ship = new Battleship();//只有一個對象，直接無參構造器固定數值即可
//
//        bombs = new Bomb[2];//創建深水炸彈數組對象，並開闢兩塊空間
//        bombs[0] = new Bomb(1, 1);//為深水炸彈數組下標0區域創建炸彈對象
//        bombs[1] = new Bomb(2, 2);//為深水炸彈數組下標0區域創建炸彈對象
//
//////        ms = new MineSubmarine[2];
//////        ms[0] = new MineSubmarine();
//////        ms[1] = new MineSubmarine();
//////
//////        ts = new TorpedoSubmarine[2];
//////        ts[0] = new TorpedoSubmarine();
//////        ts[1] = new TorpedoSubmarine();
//////
//////        os = new ObserverSubmarine[2];
//////        os[0] = new ObserverSubmarine();
//////        os[1] = new ObserverSubmarine();
////
//        submarines = new SeaObject[6];
//        submarines[0] = new MineSubmarine();
//        submarines[1] = new MineSubmarine();
//        submarines[2] = new TorpedoSubmarine();
//        submarines[3] = new TorpedoSubmarine();
//        submarines[4] = new ObserverSubmarine();
//        submarines[5] = new ObserverSubmarine();
////        for (int i = 0; i < submarines.length; i++) {
//////            submarines[i].move();
////        }
////
//////        m = new Mine[]{new Mine(1,2),new Mine(3,4)};//快捷寫法，相當於int[] arr = {10,20,30}的初始化模式
//////        t = new Torpedo[]{new Torpedo(10,10),new Torpedo(15,15)};
////
//        thunders = new SeaObject[4];
//        thunders[0] = new Mine(250, 80);
//        thunders[1] = new Mine(250, 180);
//        thunders[2] = new Torpedo(350, 80);
//        thunders[3] = new Torpedo(350, 180);
//        for (int i = 0; i < thunders.length; i++) {
//            thunders[i].move();
//        }
        Timer timer = new Timer();//創建一個具體定時器對象
        TimerTask task = new TimerTask() {//TimeTask為抽象類，其中的抽象方法為Run，可用匿名內部類直接重寫
            @Override
            public void run() {//任務體可用匿名內部類的對象名表示
//                System.out.println("任務模板確實被執行了");
                if (currentGameStatus == GAME_RUNNING) {
                    submarineEnterAction();//調用潛艇類對象出場方法
                    thunderEnterAction();//調用雷類對象出場方法
                    moveAction();//調用對象移動的方法
                    bombBangAction();//調用深水炸彈碰撞潛艇方法
                    thunderBangAction();//調用雷類碰撞戰艦方法
                    deleteWhoIsOut();//調用刪除出界對象的方法
                    repaint();//刷新繪製
//                System.out.println("當前潛艇的數量為:" + submarines.length);
                }

            }
        };
        timer.schedule(task, 5000, 10);//任務模板的執行(任務體,延遲執行多少毫秒,週期多少毫秒)
        //上述任務體task會於運行五秒之後一秒執行一次。
        //schedule方法為Timer類中內建的功能，可直接用類名打點調用
    }

    /**
     * 繪製一個自定義的窗口方法
     */
    void paintWorld() {
        JFrame frame = new JFrame();//創建一個畫框對象
        this.setFocusable(true);//可聚焦，若光標不在窗口中，其他如鍵盤上的操作都是被允許的
        frame.add(this);//為畫框添加這個類，作為底板
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);//點擊右上角"X"時，關閉(窗口)並連同退出程序(Run)
        frame.setSize(WIDTH + 16, HEIGHT + 39);//設置窗口大小(建議同背景圖)，後加數字以修正"菜單欄位"
        frame.setLocationRelativeTo(null);//窗口出現是否置中
        frame.setVisible(true);//窗口是否可見
    }

    @Override
    public void paint(Graphics g) {//底板提供的繪製方法，g相當於畫筆
//        System.out.println("繪製方法已經執行了");//先找圖片，後放座標
//        ImageIcon icon = ImageResource.battleship;
//        icon.paintIcon(this,g,270,124);
        switch (currentGameStatus){
            case GAME_START:
                ImageResource.start.paintIcon(null,g,0,0);
                break;

            case GAME_RUNNING:
                ImageResource.sea.paintIcon(null, g, 0, 0);
                ship.paintImage(g);

                for (int i = 0; i < submarines.length; i++) {
                    submarines[i].paintImage(g);
                }

                for (int i = 0; i < thunders.length; i++) {
                    thunders[i].paintImage(g);
                }

                for (int i = 0; i < bombs.length; i++) {
                    bombs[i].paintImage(g);
                }

                g.setFont(new Font("",Font.BOLD,20));//畫筆的設置字體大小功能
                g.drawString("SCORE:"+score,200,50);
                g.drawString("LIFE:"+ship.getLife(),400,50);
                break;

            case GAME_OVER:
                ImageResource.gameover.paintIcon(null,g,0,0);
        }


    }

    public static void main(String[] args) {
        GameWorld gw = new GameWorld();
        gw.paintWorld();//先有窗口才有後續動作
        gw.action();
    }


}

