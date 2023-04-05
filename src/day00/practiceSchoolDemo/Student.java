package src.day00.practiceSchoolDemo;

/**
 * 校園學生類
 */
public class Student extends Person {
        int stuID;
    Student(String name,int age,char sex,int stuID){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.stuID = stuID;
    }

    public void action(){
        System.out.println(name+"同學正在學習");
    }

    public void sayHi(){
        System.out.println("你好我叫:"+name+"，今年"+age+"歲，"+sex+"性，學號是"+stuID);
    }

}
