package src.oo.day01;

public class StudentDemo {
    public static void main(String[] args) {
//        Student w = new Student();
//
//        System.out.println(w.name);//仍未賦值，String類型 默認 null
//        System.out.println(w.age);//仍未賦值，int類型 默認 0
//        System.out.println(w.stuID);//仍未賦值，int類型 默認 0

//        w.name = "張三";
//        w.age = 18;
//        w.stuID = 7011;
//        w.sayHi();
//        w.study();
//        System.out.println(w.name+","+w.age+","+w.stuID);
//
//        Student x = new Student();
//        x.name = "李四";
//        x.age = 22;
//        x.stuID = 7012;
//        w.sayHi();
//        w.study();
//        System.out.println(x.name+","+x.age+","+x.stuID);

        //構造器與構造方法只有差別在於，構造器並無 return一說，除此之外幾乎雷同故亦稱構造方法
        //Student ss = new Student();自動調用構造器，若類中全無，則系統自動生成一無參構造方法

//        Student zs = new Student("張三",18,7011);
//        Student ls = new Student("李四",22,7012);
//        System.out.println(zs);//使用輸出語句會直接調用構造器內的toString方法
//        System.out.println(ls);//若無添加toString方法則會訪問到亂碼

        //如何將一個模板賦值進一個數組中
        Student[] stuimf = new Student[3];//創建一個Student類型的數組

        System.out.println(stuimf[0]);//數組空位內皆未定義，引用類型輸出默認值 = null
        System.out.println(stuimf[1]);//同上，null
        System.out.println(stuimf[2]);//同上，null

        stuimf[0] = new Student("zs",18,1234);//右:一個學生模板(透過形參)賦值給左:stuimf[0](數組中的空位)
        //注意，此時已不可無參使用構造器了!!

        System.out.println(stuimf[0]);//輸出會自動調用當初模板類中的toString方法，------備註一、
        System.out.println(stuimf[1]);
        System.out.println(stuimf[2]);

        //備註一、其空間內部的模板代碼亦可打點分別訪問
        System.out.println(stuimf[0].name);
        System.out.println(stuimf[0].age);
        System.out.println(stuimf[0].stuID);

    }
}
