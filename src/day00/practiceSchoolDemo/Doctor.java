package src.day00.practiceSchoolDemo;
/**
 * 校園醫護類
 */
public class Doctor extends Person  {

    String kind ;
    Doctor(String name,int age,char sex,String kind){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.kind = kind;
    }

    public void action(){
        System.out.println(name+"醫生正在醫護室值勤");
    }

    public void sayHi(){
        System.out.println("你好我叫:"+name+"，今年"+age+"歲，"+sex+"性，我是一名"+kind+"醫師");
    }
}
