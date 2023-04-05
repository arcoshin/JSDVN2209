package src.day00;

import java.util.Timer;
import java.util.TimerTask;


public class PracticeTimeTaskDemo {
    //做一個 延遲1秒 頻率2秒一次 的 7:51 起床鬧鐘
    ;
    public static void main(String[] args) {
        Timer alarm = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                int a = 7;
                int b = 51;
                System.out.println("現在時刻為"+a+":"+b+"分，您的起床鬧鐘已被正確執行~");
            }
        };
        alarm.schedule(task,1000,2000);


    }
}
