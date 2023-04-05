package src.oo.day02;

/**
 * 老師類
 */
public class Teacher extends Human {//老師類 = 子類/派生類

    //特有數據
    int salary;//學號

    //特有行為
    void teach() { }
    void sayHi() {//以同樣條件的方法實現方法重寫
        System.out.println("你好我叫" + name + "，今年" + age + "歲，" + sex + "性，是一名學生，薪俸為 :"+salary);
    }

    ;//教學行為

    //構造器
    Teacher(String name, int age, char sex, int salary) {
//            this.name = name;
//            this.age = age;
//            this.sex = sex;
        super(name, age, sex);//以上抽取為共用屬性後以super調用，僅保留特有屬性
        this.salary = salary;
    }
}
