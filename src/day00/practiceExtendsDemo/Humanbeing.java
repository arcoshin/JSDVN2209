package src.day00.practiceExtendsDemo;

class Humanbeing {
    String name;
    int age;
    char sex;


    Humanbeing(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;


    }

    @Override
    public String toString() {
        return "Humanbeing{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public static void main(String[] args) {
//        Stuclass[] stuex = new Stuclass[3];
//        stuex[0] = new Stuclass("zs", 18, '男', 12021);
//        stuex[1] = new Stuclass("ls", 24, '男', 12321);
//        stuex[2] = new Stuclass("ww", 22, '男', 12221);
//        for (int i = 0; i < stuex.length; i++) {
//            stuex[i].sayHi();
//        }
//
//        Teaclass[] teaex = new Teaclass[3];
//        teaex[0] = new Teaclass("t1", 54, '男', 1000000);
//        teaex[1] = new Teaclass("t2", 56, '女', 1200000);
//        teaex[2] = new Teaclass("t3", 58, '女', 1800000);
//        for (int i = 0; i < teaex.length; i++) {
//            teaex[i].sayHi();
//        }
//
//        Doclass[] docex = new Doclass[3];
//        docex[0] = new Doclass("d1", 50, '女', 8);
//        docex[1] = new Doclass("d2", 76, '女', 6);
//        docex[2] = new Doclass("d3", 79, '女', 15);
//        for (int i = 0; i < docex.length; i++) {
//            docex[i].sayHi();
//        }
        Humanbeing[] namelist = new Humanbeing[9];
        namelist[0] = new Stuclass("s1", 10, '男', 0013);
        namelist[1] = new Stuclass("s2", 15, '女', 0014);
        namelist[2] = new Stuclass("s3", 20, '男', 0015);
        namelist[3] = new Teaclass("t1", 35, '女', 35000);
        namelist[4] = new Teaclass("t2", 45, '男', 45000);
        namelist[5] = new Teaclass("t3", 55, '女', 55000);
        namelist[6] = new Doclass("d1", 50, '男', 12);
        namelist[7] = new Doclass("d2", 60, '女', 13);
        namelist[8] = new Doclass("d3", 70, '男', 14);
        for (int i = 0; i < namelist.length; i++) {
            System.out.println(namelist[i]);
        }

//        Stuclass zxc = new Stuclass("zxc",10,'女',0016);
//        Teaclass asd = new Teaclass("asd",20,'男',60000);
//        Doclass qwe = new Doclass("qwe",30,'女',15);
//        Humanbeing qwer = new Humanbeing("qwer",40,'男');//少一個參數(半成品)
    }
}
