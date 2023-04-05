package src.objectdemo;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;
import com.sun.org.apache.xpath.internal.objects.XObject;
import src.day00.practicePlaneSystem.Airplane;

import java.util.Arrays;

/**
 * Object的使用演示類
 */
public class ObjectDemo {
    public static void main(String[] args) {
//        Aoo a1 = new Aoo();
//        Object o1 = new Aoo();
//        Object o2 = new Boo();
        /**
         * 當我們打印輸出引用類型變量時，會輸出類的全包名@對象內存地址
         * 因為我們打印對象時，對象會默認調用toString方法
         * 可以透過重寫方法獲得我們想要的資訊
         */
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);
        System.out.println(p1 == p2);//false 引用類型比較的是內存地址，有new故不同
        System.out.println((p1.getX() == p2.getX()) && (p1.getY() == p2.getY()));//比的是參數，故true
        System.out.println(p1.equals(p2));//重寫後比較的就是內容，故true

        String a = "ABC";
        String b = "ABC";
        System.out.println(a == b);//比的是內存地址
        String c = new String("ABC");
        System.out.println(a.equals(c));//String內建已重寫過的equals()方法

//        System.out.println(p1);
//        int[] arr = {1,2,3,4,5,6,7};
//        System.out.println(Arrays.toString(arr));//Arrays數組類已自帶toString功能
//
//        String str = p1.toString();
//        System.out.println(st


    }
}

class Aoo {

}

class Boo extends Aoo {

}