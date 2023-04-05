package src.day05;

//循環三要素:變量初始化、循環條件、基於循環下變量的改變(遞增、遞減)
public class WhileDemo {
    public static void main(String[] args) {
        int count = 0;
        while (count < 3) {
            System.out.println("任務尚未完成，請再接再厲");
            count++;
        }
        System.out.println("任務已完成，循環結束");

        int c = 0;
        while (c != 10) {
            System.out.println("大會報告，恭喜小明同學已完成第" + (c + 1) + "圈");
            c++;
        }

        /**
         * 一顆球自100公尺落下，每次反彈50%高度，最低反彈條件為 彈起高度 >= 0.01
         * 反彈幾次?路程?
         */
        double h = 100;//高程
        double sum = h;//總路程級數，首次落下直接定義為初始值

        int n = 0;//落下次數
        while (h / 2 >= 0.01) {
            h *= 0.5;//先判斷本次會不會反彈，若彈起高度不足0.01則不彈
            n++;//計次
            sum += h * 2;//計入級數，其中反彈之距離 = 前次落下之距離，故兩倍計算
        }

        System.out.println("共彈起"+n+"次");
        System.out.println("路程共"+sum+"公尺");

    }
}
