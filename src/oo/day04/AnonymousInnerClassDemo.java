package src.oo.day04;

/**
 * 匿名內部類使用演示(常使用)
 */
public class AnonymousInnerClassDemo {
    public static void main(String[] args) {
        //使用匿名內部類重寫父類中的show方法
        //1.創建SuperDemo的子類對象，但沒有名字
        //2.將創建的子類對象賦值給sub變量
        //3.花括號即表示該匿名子類之類體(在此實現重寫)
        SuperDemo sub = new SuperDemo() {
            //該匿名類是AnonymousInnerClassDemo的內部類
            //直接在此花括號實現方法重寫
            public void show(){
                System.out.println("通過匿名內部類實現了方法重寫");
            }
        };
        sub.show();//實現了調父執行子(記得不可超出main方法花括號之外)

        SuperDemo sub1 = new SuperDemo(){};
        SuperDemo sub2 = new SuperDemo(){};
        SuperDemo sub3 = new SuperDemo(){};
        SuperDemo sub4 = new SuperDemo(){};



    }
}

class SuperDemo{
    public void show(){//父類中方法

    }
}
