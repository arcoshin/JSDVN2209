package src.day00;

public class PracticeGetRandomListDemo {
    public static void main(String[] args) {

        //作業
        String[] nameList = {"aa", "bb", "cc", "dd", "ee"};
        for (int i = 0; i < nameList.length; i++) {
            System.out.print(nameList[i] + "\t");
        }
        System.out.println();

        getRandomFromlist(nameList);
        getRandomFromlist(nameList);
        getRandomFromlist(nameList);
    }

    static void getRandomFromlist(String[] List) {
        int r = (int) (Math.random() * (List.length));//random包含下界但不包含上界
        //System.out.println(r);//[0~length]不含length
        System.out.println("請問" + List[r] + "同學今天有來嗎?");
    }

}
