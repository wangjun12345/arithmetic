package com.wac.arithmetic.question;

/**
 * @author wj
 * @Description: 罗马数字转整数
 * 解释参考0012题
 * @date 2021/7/23 8:55 上午
 */
public class Question0013A {
    public static void main(String[] args) {
        String s = "III";
        int rs = t1(s);
        System.out.println(rs);
    }

    private static int t1(String s) {
        char[] chars = s.toCharArray();
        int sum = toInteger(chars[chars.length - 1]);
        for (int i = chars.length - 2; i >= 0; i--) {
            int i1 = toInteger(chars[i]);
            int i2 = toInteger(chars[i + 1]);
            if (i1 >= i2){
                sum = sum + i1;
            } else {
                sum = sum - i1;
            }
        }
        return sum;
    }

    private static int toInteger(char c) {
        String str = c + "";
        if ("I".equals(str)){
            return 1;
        } else if ("V".equals(str)){
            return 5;
        } else if ("X".equals(str)){
            return 10;
        } else if ("L".equals(str)){
            return 50;
        } else if ("C".equals(str)){
            return 100;
        } else if ("D".equals(str)){
            return 500;
        } else {
            return 1000;
        }
    }
}
