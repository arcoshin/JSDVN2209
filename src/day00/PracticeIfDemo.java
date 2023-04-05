package src.day00;

public class PracticeIfDemo {
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
        double r = 0;
        if (c==1){
            r = a+b;
            System.out.println(r);
        }else if (c==2){
            r = a-b;
            System.out.println(r);
        }else if (c==3){
            r = a*b;
            System.out.println(r);
        }else if (c==4){
            r=a/b;
            System.out.println(r);
        }else if (c==5){
            r=a%5;
            System.out.println(r);
        } else {
            System.out.println("輸入錯誤，請重新輸入");
        }


    }
}
