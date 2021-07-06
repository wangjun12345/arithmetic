package com.wac.arithmetic.primary.array;

import java.util.Arrays;

/**
 * @author wj
 * @Description: 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * @date 2021/6/17 8:58 上午
 */
public class Array7 {
    public static void main(String[] args) {
        int[] digits = {9};
//        System.out.println(Arrays.toString(t1(digits)));
        System.out.println(Arrays.toString(t2(digits)));
    }

    /**
     * 数组长度过长的话，无法拼接整数
     * @param digits
     * @return
     */
    private static int[] t1(int[] digits) {
        if(digits[0] == 0){
            return new int[]{digits[0] + 1};
        }
        Long sum = 0L;
        boolean needAddLength = true;
        for (int i = 0; i < digits.length; i++) {
            if(digits[i] < 9){
                needAddLength = false;
            }
            sum = 10L * sum + digits[i];
        }
        sum++;
        int[] arr = new int[needAddLength ? digits.length + 1 : digits.length];
        for(int i = 0; i < arr.length; i++){
            arr[arr.length - i - 1] = (int) (sum % 10L);
            sum /= 10;
        }
        return arr;
    }

    private static int[] t2(int[] digits) {
        if(digits[0] == 0){
            return new int[]{digits[0] + 1};
        }
        boolean needAddLength = true;
        boolean needCarry = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] < 9){
                needAddLength = false;
            }
            if(i == digits.length - 1){
                digits[i] ++;
                if(digits[i] == 10){
                    digits[i] = 0;
                    needCarry = true;
                }
            }else{
                digits[i] = needCarry ? digits[i] + 1 : digits[i];
                if(digits[i] == 10){
                    digits[i] = 0;
                    needCarry = true;
                }else{
                    needCarry = false;
                }
            }
        }
        if(needAddLength){
            int[] arr = new int[digits.length + 1];
            arr[0] = 1;
            return arr;
        }
        return digits;
    }

//    private static int[] t2(int[] digits) {
//        if(digits[0] == 0){
//            return new int[]{digits[0] + 1};
//        }
//        boolean needAddLength = true;
//        for (int digit : digits) {
//            if(digit < 9){
//                needAddLength = false;
//                break;
//            }
//        }
//        if(needAddLength){
//            int[] arr = new int[digits.length + 1];
//            arr[0] = 1;
//            return arr;
//        }
//        boolean needCarry = false;
//        for (int i = digits.length - 1; i >= 0; i--) {
//            if(i == digits.length - 1){
//                digits[i] ++;
//                if(digits[i] == 10){
//                    digits[i] = 0;
//                    needCarry = true;
//                }
//            }else{
//                digits[i] = needCarry ? digits[i] + 1 : digits[i];
//                if(digits[i] == 10){
//                    digits[i] = 0;
//                    needCarry = true;
//                }else{
//                    needCarry = false;
//                }
//            }
//        }
//        return digits;
//    }
}
