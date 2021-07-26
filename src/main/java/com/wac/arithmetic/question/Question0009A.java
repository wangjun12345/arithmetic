package com.wac.arithmetic.question;

/**
 * @author wj
 * @Description: 回文数
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是
 *
 * @date 2021/7/21 10:33 上午
 */
public class Question0009A {
    public static void main(String[] args) {
        int x = 121;
        boolean rs = t1(x);
        System.out.println(rs);
    }

    private static boolean t1(int x) {
        if(x < 0){
            return false;
        }
        int left = 0;
        String strX = x + "";
        int right = strX.length() - 1;
        while(left < right){
            if(strX.charAt(left++) != strX.charAt(right--)){
                return false;
            }
        }
        return true;
    }
}
