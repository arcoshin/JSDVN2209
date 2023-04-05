package src.day00;

public class PracticeBreakDemo {
    public static void main(String[] args) {
        //1-100 sum <=2500 stop index?

        int sum = 0;
        int index = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            if (sum >= 2500) {
                index = i;
                System.out.println(index);
                System.out.println(sum);
                break;
            }
        }
        int s = 0;
        for (int i = 1; i < 72; i++) {
            s += i;
            System.out.println("再加了" + i + "等於" + s);
        }


    }
}
