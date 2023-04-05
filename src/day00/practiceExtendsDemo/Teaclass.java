package src.day00.practiceExtendsDemo;

class Teaclass extends Humanbeing {
    int salary;

    Teaclass(String name, int age, char sex, int salary) {
        super(name, age, sex);
        this.salary = salary;
    }

    void sayHi() {//打招呼行為
        System.out.println("你好我叫" + name + "，今年" + age + "歲，薪俸是" + salary + "元");
    }
}
