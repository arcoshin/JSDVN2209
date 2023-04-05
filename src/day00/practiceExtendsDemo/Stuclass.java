package src.day00.practiceExtendsDemo;

class Stuclass extends Humanbeing {
    int stuID;

    Stuclass(String name, int age, char sex, int stuID) {
        super(name, age, sex);
        this.stuID = stuID;
    }

    void sayHi() {//打招呼行為
        System.out.println("你好我叫" + name + "，今年" + age + "歲，學號是" + stuID);
    }
}
