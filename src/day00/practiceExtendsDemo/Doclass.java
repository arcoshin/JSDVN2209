package src.day00.practiceExtendsDemo;

class Doclass extends Humanbeing {
    int level;

    Doclass(String name, int age, char sex, int level) {
        super(name, age, sex);
        this.level = level;
    }

    void sayHi() {//打招呼行為
        System.out.println("你好我叫" + name + "，今年" + age + "歲，職級是" + level + "級");
    }
}
