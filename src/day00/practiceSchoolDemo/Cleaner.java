package src.day00.practiceSchoolDemo;
/**
 * 校園清潔工類
 */
public class Cleaner extends Person  {

    int number;
    Cleaner(String name,int age,char sex,int number){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.number = number;
    }

    public void action(){
        System.out.println(name+"正在清掃校園");
    }

    public void sayHi(){
        System.out.println("你好我叫:"+name+"，今年"+age+"歲，"+sex+"性，我的編號為:"+number);
    }
}
