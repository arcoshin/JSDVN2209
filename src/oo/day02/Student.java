package src.oo.day02;

/**
 * 學生類
 */
public class Student extends Human {//學生類 = 子類/派生類

    //特有數據
    int stuID;//學號

    //特有行為
    void study() { }
    void sayHi() {//以同樣條件的方法實現方法重寫
        System.out.println("你好我叫" + name + "，今年" + age + "歲，" + sex + "性，是一名學生，學號為 :"+stuID);
    }

    ;//學習行為

    //構造器
    Student(String name, int age, char sex, int stuID) {
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
        super(name, age, sex);//以上抽取為共用屬性後以super調用，僅保留特有屬性
        this.stuID = stuID;
    }
}
