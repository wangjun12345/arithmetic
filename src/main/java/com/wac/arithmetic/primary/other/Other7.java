package com.wac.arithmetic.primary.other;

/**
 * @author wj
 * @Description: 3的幂
 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方。如果是，返回 true ；否则，返回 false 。
 * 整数 n 是 3 的幂次方需满足：存在整数 x 使得 n == 3x
 * @date 2021/7/16 9:56 上午
 */
public class Other7 {
    public static void main(String[] args) {
        boolean rs = t1(9);
        System.out.println(rs);
    }

    private static boolean t1(int n) {
        if(n <= 0){
            return false;
        }
        if(n == 1){
            return true;
        }
        while(n != 3){
            if(n % 3 > 0){
                return false;
            }
            n /= 3;
        }
        return true;
    }
}
