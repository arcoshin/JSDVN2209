import java.util.Scanner;

/**
 *  switch多路分支語法結構使用
 */
public class SwitchDemo {
    public static void main(String[] args) {
        /**
         * 客服總機分機功能
         */
        Scanner s = new Scanner(System.in);
        System.out.println("國語服務請按 1，台語服務請按 2，英語服務請按 3，轉接專人請按 9");
        int user = s.nextInt();
        switch (user){
            case 1://if(user == 1)
                System.out.println("請稍後，國語服務已開始...");
                break;//避免貫穿執行
            case 2://if(user == 2)
                System.out.println("請稍後，台語服務正在初始化...");
                break;//避免貫穿執行
            case 3://if(user == 3)
                System.out.println("請稍後，英文服務正在初始化...");
                break;//避免貫穿執行
            case 9://if(user == 9)
                System.out.println("請稍後，已為您轉接專人...");
                break;//避免貫穿執行
            default:
                System.out.println("輸入錯誤，請重新輸入");





        }










    }
}
