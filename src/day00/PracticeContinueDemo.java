package src.day00;

public class PracticeContinueDemo {
    public static void main(String[] args) {
        //sum 3n 1-100
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

        int s =0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0) {
                continue;
            }
            s += i;
        }
        System.out.println(s);
    }
}

