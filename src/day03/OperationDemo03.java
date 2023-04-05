package src.day03;

import com.sun.org.apache.xpath.internal.objects.XString;

import javax.print.DocFlavor;
import java.util.NoSuchElementException;

/**
 * 擴展數值運算符
 * 三元運算符
 * 字符串拼接符
 */
public class OperationDemo03 {
    public static void main(String[] args) {

//        //擴展數值運算符
//        int a = 10;
//        a += 10;//a= a+10
//        System.out.println(a);//20
//
//        a -= 10;//a= a-10
//        System.out.println(a);//0
//
//        a *= 2;//a= a*10
//        System.out.println(a);//20
//
//        a /= 5;//a= a/10
//        System.out.println(a);//4
//
//        a %= 2;//a= a%10
//        System.out.println(a);//0

//        //三元運算符(條件? 返回值1:返回值2，返回值類型應一致)
//        int a = 20;
//        int b = 30;
//        int max = a < b ? b : a;
//        System.out.println(max);//最大值
//
//        int c = 10;
//        boolean r = c % 2 == 0 ? true : false;
//        System.out.println(r);//true
//
//        int d = 5;
//        char t1 = d % 2 == 0 ? 'Y' : 'N';//N
//        int t2 = d % 2 == 0 ? 'Y' : 'N';//78，輸出結果取決於類型
//        System.out.println(t1);
//        System.out.println(t2);

        //字符串拼接符
        System.out.println(10+10+""+30);//2030
        System.out.println(""+10+10+30);//101030
        System.out.println(10+10+30+"");//50
        String name = "呵呵";
        String age = "哈哈";
        System.out.println("這位同學叫"+name+"他的年紀是"+age);


    }
}
