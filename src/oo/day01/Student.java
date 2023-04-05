package src.oo.day01;

/**
 *  學生類模板
 * 1.放所有學生類對象共有的數據
 * 2.放所有學生類對象共有的行為
 * 3.模板類不需要添加main功能
 */
public class Student {
    //共有數據(屬性)------變量(此處變量為全局/成員/實例變量，全類適用)
    protected String name;//姓名
    int age;//年齡
    int stuID;//學號
    private int num;
    //構造器(建構子)
//    Student(String name,int age_,int stuID_){
//        this.name = name;
//        age = age_;
//        stuID = stuID_;//若前後變量名不衝突，可以省略this
//    }

    //使用Generate自動生成構造器
    public Student(String name, int age, int stuID) {
        this.name = name;
        this.age = age;
        this.stuID = stuID;
    }

    //使用Generate自動生成檢測語句
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", stuID=" + stuID +
                '}';
    }

    //共有行為(動作)------方法(此處變量為局部變量，僅當前方法內可用)
    void study(){//學習行為
        System.out.println(name+"正在學習");
    }
    void sayHi(){//打招呼行為
        System.out.println("你好我叫"+name+"，今年"+age+"歲，學號是"+stuID);
    }
}
