package src.day00.practiceSchoolDemo;

public class SchoolDemo {
    public static void main(String[] args) {
        Person[] Schoolist = new Person[20];
        Schoolist[0] = new Student("zs",18,'男',2102);
        Schoolist[1] = new Student("ls",19,'男',2103);
        Schoolist[2] = new Student("ww",20,'男',2104);
        Schoolist[3] = new Student("s1",21,'女',2105);
        Schoolist[4] = new Student("s2",22,'女',2106);

        Schoolist[5] = new Teacher("t1",30,'女',30000);
        Schoolist[6] = new Teacher("t2",35,'女',35000);

        Schoolist[7] = new Cleaner("cl-01",50,'男',4013);
        Schoolist[8] = new Cleaner("cl-02",51,'女',4014);
        Schoolist[9] = new Cleaner("cl-03",52,'男',4015);

        Schoolist[10] = new Cooker("ck-01",36,'男',"中餐");
        Schoolist[11] = new Cooker("ck-02",37,'男',"西餐");
        Schoolist[12] = new Cooker("ck-03",38,'女',"美式");
        Schoolist[13] = new Cooker("ck-04",39,'男',"法式");
        Schoolist[14] = new Cooker("ck-05",40,'男',"義式");

        Schoolist[15] = new Doctor("dc-01",49,'男',"耳鼻喉科");
        Schoolist[16] = new Doctor("dc-02",50,'女',"傷照科");
        Schoolist[17] = new Doctor("dc-03",51,'男',"骨科");
        Schoolist[18] = new Doctor("dc-04",52,'女',"皮膚科");
        Schoolist[19] = new Doctor("dc-05",53,'男',"精神科");

        for (int i = 0; i < Schoolist.length; i++) {
            Schoolist[i].sayHi();
            Schoolist[i].action();
        }










    }
}
