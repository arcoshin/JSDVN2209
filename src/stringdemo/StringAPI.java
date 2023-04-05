package src.stringdemo;

import java.util.Arrays;

/**
 * 測試StringAPI功能的使用
 */
public class StringAPI {
    public static void main(String[] args) {
        /**
         *         StringAPI: length() 和 charAt() 的使用 */

        String str = "Thinking in java是一本好書";
        int len = str.length();//length() 獲取字符串長度
        System.out.println(len);
        char t = str.charAt(len - 1);//charAt(int index)通過傳遞下標返回字符串對應下標得對象
        System.out.println(t);
        //練習，通過for循環，將str中的字符串內容，依次遍歷打印輸出
        //面試題:請編寫一段程序，將字符串中"i"這個字存在的字數統計出來
        int iCount = 0;
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            if (str.charAt(i) == 'i') {
                iCount++;
            }
        }
        System.out.println();
        System.out.println("'i'共有:" + iCount + "個");

        /** StringAPI: indexOf() 和 lastIndexOf() 的使用
         *
         */
        str = "Thinking in java是一本好書";
        int index = str.indexOf('i');//從頭到尾遍歷搜尋'i'，如搜尋到則立刻返回該下標
        System.out.println(index);
        index = str.indexOf('i', 3);//第二個參數表示起始搜尋的位置下標
        System.out.println(index);
        index = str.indexOf("java");//從頭到尾遍歷搜尋"java"，如搜尋到則立刻返回該起始字母下標
        System.out.println(index);
        index = str.lastIndexOf('i');//從尾到頭，剩下功能相同
        System.out.println(index);

        /** StringAPI: toUpperCase(),toLowerCase() 的使用
         *
         */
        str = "Thinking in java是一本好書";
        str = str.toUpperCase();//將字符串內所有英文字面量轉為大寫
        System.out.println(str);
        str = str.toLowerCase();//將字符串內所有英文字面量轉為小寫
        System.out.println(str);

        /**StringAPI: trim(),startsWith(),endsWith() 的使用
         */
        str = "  Tom  ";
        System.out.println(str);
        str = str.trim();//將字符字面量兩側空白值刪除的功能
        System.out.println(str);
        System.out.println(str.startsWith("T"));//判斷是否是以T字母開頭的方法，必須嚴格區分大小寫
        System.out.println(str.endsWith("m"));//判斷是否是以m字母結尾的方法，必須嚴格區分大小寫

        /** StringAPI: substring() 和 String.valueOf() 的使用
         *
         */
        String mail = "abcdefghijk@tedu.cn";
        String user = mail.substring(0, 11);//substring擷取時下標包頭不包尾
        System.out.println(user);

        //如何擷取用戶名的代碼更加靈活?
        mail = "liucs@tedu.cn";
        user = mail.substring(0, mail.indexOf('@'));
        System.out.println(user);

        //如果有需要，可以根據長度來擷取
        str = "123456789";
        str = str.substring(2, 2 + 5);//下標2開始擷取長度5的字符串
        System.out.println(str);//34567

        int number = 123456;
        //String類中提供了一個靜態的方法: valueOf() 將傳入的數據轉換為String類型
        str = String.valueOf(number);
        System.out.println(str + 2);//1234562

        /** StringAPI: contains(),isEmpty(),toCharArray(),toString()
         *
         */
        str = "OOP";//contains():判斷是否包含某字符串的方法
        System.out.println(str.contains("OO"));//true
        System.out.println(str.contains("Oo"));//false，嚴格區分大小寫

        str = "";//isEmpty():判斷當前字符串長度是否為0的方法，意義不同於null
        System.out.println(str.isEmpty());//true

        str = "Thinking in java是一本好書";
        char[] chars = str.toCharArray();//將字符串對象轉換為char的方法
        System.out.println(Arrays.toString(chars));//輸出數組中的內容

        //面試題: 根據字符串內容判斷內容是否是回文數(正反讀皆相同)
        str = "上海自來水來自海上";
        StringAPI stringAPI = new StringAPI();
        System.out.println(stringAPI.isHWS(str));

        //需求題:將字符串中數值的內容進行計算累加。  問題:有可能以後還會繼續增加內容
        str = "1.永遠年輕 2.永遠熱淚盈眶 3.永遠在路上 4.";
        /** Hint:  char[] example = {'0','1','2','3','4','5','6','7','8','9'};
         *         for (int i = 0; i < example.length; i++) {
         *             System.out.print((int)example[i]+"\t");
         *         }//(48,49,50,51,52,53,54,55,56,57)
         */
        System.out.println("這個字符串中所有數字的和為:" + stringAPI.sumOfSentence(str));

    }

    boolean isHWS(String sentence) {
        char[] chars = sentence.toCharArray();
        //System.out.println(Arrays.toString(chars));
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == chars[chars.length - 1 - i]) {
                return true;
            }
            
        }
        return false;
    }

    int sumOfSentence(String sentence) {
        int sum = 0;
        char[] chars = sentence.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int realNumber = (int) chars[i] - 48;
            if (realNumber >= 0 && realNumber <= 9) {
                sum += realNumber;
            }
        }
        return sum;
    }
}

