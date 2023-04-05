package src.oo.day02;

/**
 * 醫生類
 */
public class Doctor extends Human {//醫生類 = 子類/派生類

    //特有數據
    int level;//職級

    //特有行為
    void cut() { }
    void sayHi() {//以同樣條件的方法實現方法重寫
        System.out.println("你好我叫" + name + "，今年" + age + "歲，" + sex + "性，是一名醫生，職等為 :"+level);
    }


    ;//開刀行為

    //構造器
    Doctor(String name, int age, char sex, int level) {
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
        super(name, age, sex);//以上抽取為共用屬性後以super調用，僅保留特有屬性
        this.level = level;
    }
}
