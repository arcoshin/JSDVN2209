package src.stringbuilderdemo;

/**
 * stringBuilder 使用演示類 : 如果對String頻繁修改時建議使用此方法
 * 因為stringBuilder內部維護了一個可變的char數組
 * 優點在於修改性能較小且提供常用增刪功能
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
//        String str = "a";
//        StringBuilder builder = new StringBuilder(str);
//        long start = System.currentTimeMillis();//獲取當前毫秒
//        for (int i = 0; i < 100000; i++) {
////            str += "a";//OutOfMemoryError 內存溢出錯誤
//            builder.append("a");
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("運行時間為:" + (end - start + "ms"));


        //StringBuilder的使用
        String str = "好好學習Java";
        StringBuilder builder = new StringBuilder(str);
        //append();追加內容的方法，直接將要加入的字符串內容寫在小括號內
        builder.append(",為了找份好工作");
        System.out.println(builder);
        //replace();修改內容的方法 :
        /**1.替代開始的索引(下標包頭)
         * 2.結束替換的索引(下標不包尾)
         * 3.要替換的內容 */
        builder.replace(9,16,"為了改變世界");
        System.out.println(builder);
        //insert();插入的方法 : 1.插入的索引 2.插入的內容
        builder.insert(2,"加油~!");
        System.out.println(builder);
        //delete();將內容刪除的方法
        builder.delete(2, 6);//刪除結果下標包頭不包尾
        System.out.println(builder);
        //reverse();將內容反序的方法
        builder.reverse();
        System.out.println(builder);
        //reverse();將最終修改內容導出的方法
        str = builder.toString();
        System.out.println(str);


    }
}
