package src.day03;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

/**
 * 關係運算符
 */
public class OperationDemo02 {

    public static void main(String[] args) {

//        int a = 50;
//        int b = 40;
//        boolean r1 = a > b;
//        System.out.println(r1);//true
//        System.out.println(a < b);//false
//        System.out.println(10 <= 10);//true
//        System.out.println(10 != 10);//false
//        System.out.println(5 == 4);//false
/**
 * 邏輯運算符
 */
//        int x = 5;
//        int y = 10;
//        int z = 5;
//
//        boolean rr1 = x > y && y > z;
//        System.out.println(rr1);
//        boolean rr2 = x > y || y > z;
//        System.out.println(rr2);
//
//        System.out.println(x < ++z && z > 5);
//        System.out.println(!(z == ++x));

//        //閏年判斷應用
//        Scanner s = new Scanner(System.in);//創建一個掃描器
//        System.out.println("請輸入要判斷的年份後，按下ENTER回傳");
//        int year = s.nextInt();//從控制台讀取用戶輸入的int類型訊息 並賦值給year
//        boolean result = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
//        //四年一閏，百年不閏，四百年再閏
//        System.out.println(result);

//        //短路
//        int a = 5;
//        int b = 20;
//        System.out.println(a > b && ++b > a);//false，由於計算前項條件即知結果為false，便不會再執行後項條件，形成短路
//        System.out.println(b);//20，故由此可見後項的自增並無執行
//        System.out.println(a < b & ++b > a);//true
//        System.out.println(b);//21，前後項皆判斷完才知結果，故後項仍有執行自增，無短路
//        System.out.println(++a < b || ++b >= 21);//true，形成短路，預知後項條件並未執行(注意前項已經重新賦值b=21)
//        System.out.println(b);//21，得證


    }
}
