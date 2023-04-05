package src.day05;

/**
 * 雙重for循環範例 : 實現九九乘法表的打印
 * for(){
 * for(){}
 * }
 */
public class ForDemo02 {
    public static void main(String[] args) {

        for (int n1 = 1; n1 <= 9; n1++) {
            for (int n2 = 1; n2 <= n1; n2++) {
                System.out.print(n2 + " X " + n1 + " = " + n1 * n2 + "\t");
            }
            System.out.println();
        }


    }
}
