package com.wac.arithmetic.primary.str;

/**
 * @author wj
 * @Description: 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 * 假设环境不允许存储 64 位整数（有符号或无符号）
 * @date 2021/6/21 9:20 上午
 */
public class Str2 {
    public static void main(String[] args) {
//        int x = 1534236469;
        int x = 123;
        int rs = t1(x);
        System.out.println(rs);
    }


    private static int t1(int x) {
        int rs = 0;
        while (x != 0){
            int ys = x % 10;
            int cs = rs * 10;
            rs = cs + ys;
            x = x / 10;
            if(rs/10 != cs/10 || rs % 10 != ys){
                return 0;
            }
        }
        return rs;
    }
}
