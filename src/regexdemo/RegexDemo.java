package src.regexdemo;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 正則表達式的使用演示類
 */
public class RegexDemo {
    public static void main(String[] args) {

        /**信箱格式正則表達式
         String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";//正則信箱格式
         String mail = "shawein_7w2efr7_fwqegwergfawqed@yahoo.com.tw";//信箱
         if (mail.matches(regex)){
         System.out.println("格式正確");
         }else {
         System.out.println("格式錯誤");
         }*/
        /**身分證號碼格式正則表達式
        System.out.println("請輸入身分證號碼");
        Scanner scanner = new Scanner(System.in);
        String ID = scanner.next();

         String r1 = "\\d{15}|\\d{17}[\\dxX]";//(\d = [0-9])
        if (ID.matches(r1)) {
            System.out.println("格式正確");
        } else {
            System.out.println("格式錯誤");
        }*/
        /**總機號碼的格式正則表達式
        System.out.println("請輸入電話號碼");
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        String r1 = "[(]?[\\d]{3,4}[)-]?[\\d]{7,8}";
        if (num.matches(r1)) {
            System.out.println("格式正確");
        } else {
            System.out.println("格式錯誤");
        }*/
        String str = "abc123def456ghi789";
        //split();切除的方法
        String[] splitDate = str.split("[\\d]+");
        System.out.println(Arrays.toString(splitDate));
        str = "a@b@c@d@e@f";
        splitDate = str.split("@");
        System.out.println(Arrays.toString(splitDate));

        //replaceAll();取代的方法，支持正則
        String regex = "(wr|nc|sjb|tmd)";
        String message = "tmd!你這個nc,簡直sjb";
        message.replaceAll(regex,"小可愛");
        System.out.println(message);
        //replace();取代的方法，但要注意不支持正則
        message = "abc123def123ghi123";
        message = message.replace("123","-");
        System.out.println(message);

    }
}
