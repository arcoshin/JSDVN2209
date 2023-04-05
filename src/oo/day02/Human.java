package src.oo.day02;

/**
 * 人類
 */
public class Human {//人類 = 父類/超類

    //共有數據
    String name;
    int age;
    char sex;


    //共有行為
    void sayHi() {//打招呼行為
        System.out.println("你好我叫" + name + "，今年" + age + "歲，" + sex + "性");
    }

    //共用構造器(抽取共用屬性)
    Human(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;

    }
}
