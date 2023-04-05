package src.day06;

/**
 * 有參有返回值方法
 */
public class MethodDemo04 {
    public static void main(String[] args) {
        sum(10, 20);
        sum(100, 1000);
        sum(10000, 1000);
        sum(1.34, 2.66);//方法重載
        sum(10, 20, 5);//方法重載

    }

    //int (返回值，空白時使用void)
    static int sum(int n1, int n2) {
        int sum = n1 + n2;
        System.out.println(sum);
        return sum;//也可以直接return n1 + n2 不過外部需要另外輸出語句
    }

    static double sum(int n1, int n2, int n3) {//返回值必須可以兼容，則即使不同類型也不會報錯
        int sum = n1 + n2 + n3;
        System.out.println(sum);
        return sum;
    }

    static double sum(double n1, double n2) {
        double sum = n1 + n2;
        System.out.println(sum);
        return sum;
    }


}
