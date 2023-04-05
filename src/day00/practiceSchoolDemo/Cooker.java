package src.day00.practiceSchoolDemo;
/**
 * 校園廚師類
 */
public class Cooker extends Person  {

    String kind ;
    Cooker(String name,int age,char sex,String kind){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.kind = kind;
    }

    public void action(){
        System.out.println(name+"正在學生廚房準備"+kind+"料理");
    }

    public void sayHi(){
        System.out.println("你好我叫:"+name+"，今年"+age+"歲，"+sex+"性，我的專長是:"+kind);
    }
}
