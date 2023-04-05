package src.day00;

public class PracticeSwitchDemo {
    public static void main(String[] args) {
        // 1 = + ; 2 = - ; 3 = * ; 4 = / ; 5 = %;

        operation(20,10,1);
        operation(20,10,2);
        operation(20,10,3);
        operation(20,3,4);
        operation(20,3,5);
        operation(20,3,6);

    }
    static void operation(double a,double b,int c){
        double result = 0;
        switch (c){
            case 1:
                result = a + b;
                System.out.println(result);
                break;//使用switch真的要特別注意貫穿問題
            case 2:
                result = a - b;
                System.out.println(result);
                break;
            case 3:
                result = a * b;
                System.out.println(result);
                break;
            case 4:
                result = a / b;
                System.out.println(result);
                break;
            case 5:
                result = a % b;
                System.out.println(result);
                break;
            default:
                System.out.println("您所輸入的序列不合法，請重新輸入");
                break;
        }

    }
}
