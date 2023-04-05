package src.oo.day02;

public class ExtendsDemo {

    public static void main(String[] args) {

//        //子類是否繼承父類?
//        Student zs = new Student();
//        System.out.println(zs.name);//共有數據已繼承故可調閱(但仍未賦值故輸出得默認值)
//        zs.name = "張三";
//        System.out.println(zs.age);//共有數據已繼承故可調閱(但仍未賦值故輸出得默認值)
//        zs.age = 18;
//        System.out.println(zs.sex);//共有數據已繼承故可調閱(但仍未賦值故輸出得默認值)
//        zs.sex = '男';
//
//        zs.sayHi(); //特有數據理所當然可以使用(仍未賦值故輸出得默認值)
//
//        //父類是否反抽取子類?
//        Human ls = new Human("李四",22, '男');
//        ls.name = "李四";//共有數據故可調閱並賦值
//        ls.age = 22;//共有數據故可調閱並賦值
//        ls.sex = '男';//共有數據故可調閱並賦值
//        //ls.study();//編譯錯誤，特有數據因為僅能單向繼承故因而不可使用(無法調閱)
        /**
         * 三種類型數組各自遍歷，for循環形成冗餘，使用"向上造型"解決問題，統一管理
         * 語法 : 聲明 父 new 子
         * 父大子小(自動類型轉換)
         * 向上造型的好處在於可以用一個父類，來代表不同類型的子對象
         */

        Human[] humanList = new Human[9];
        humanList[0] = new Student("zs", 18, '男', 1201);
        humanList[1] = new Student("ls", 22, '男', 1202);
        humanList[2] = new Student("ww", 24, '男', 1205);
        humanList[3] = new Teacher("t1", 50, '女', 100000);
        humanList[4] = new Teacher("t2", 65, '男', 120000);
        humanList[5] = new Teacher("t3", 55, '女', 110000);
        humanList[6] = new Doctor("d1", 34, '男', 15);
        humanList[7] = new Doctor("d2", 54, '女', 20);
        humanList[8] = new Doctor("d3", 74, '男', 25);
        for (int i = 0; i < humanList.length; i++) {
            humanList[i].sayHi();
            //編譯期間使用的是 humanList(父類) 的sayHi方法，因為可以調用的屬性取自於類型模板(Human)
            //運行期間執行的是 子類中各自重寫的方法
            //聲明 父 new 子 ，才會調 父 執行 子
        }


    }
}

