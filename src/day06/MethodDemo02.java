package src.day06;

/**
 * 有參無返回值方法
 */
public class MethodDemo02 {
    public static void main(String[] args) {
    sayHint("早安",11);
    sayHint("午安",3);
    sayHint("晚安",9);
    }
    static void sayHint(String time,int point){
        System.out.println(time+"，依照計畫待會上工時要注意的"+point+"個重點都記好了嗎?");
    }
}
