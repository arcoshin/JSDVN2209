package src.day00.practiceSchoolDemo;
/**
 * 校園教師類
 */
public class Teacher extends Person {
    int salary;
    Teacher(String name,int age,char sex,int salary){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
    }

    public void action(){
        System.out.println(name+"老師正在授課");
    }

    public void sayHi(){
        System.out.println("你好我叫:"+name+"，今年"+age+"歲，"+sex+"性，是一名教師");
    }
}
