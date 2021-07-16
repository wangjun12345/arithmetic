package com.wac.arithmetic.primary.other;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wj
 * @Description: 写一个程序，输出从 1 到 n 数字的字符串表示。
 * 1. 如果 n 是3的倍数，输出“Fizz”；
 * 2. 如果 n 是5的倍数，输出“Buzz”；
 * 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
 *
 * @date 2021/7/15 2:07 下午
 */
public class Other5 {
    public static void main(String[] args) {
        List<String> rs = t1(16);
        System.out.println(rs);
    }

    private static List<String> t1(int n) {
        List<String> rs = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            if(i % 15 == 0){
                rs.add("FizzBuzz");
            }else if(i % 3 == 0){
                rs.add("Fizz");
            }else if(i % 5 == 0){
                rs.add("Buzz");
            }else{
                rs.add(i + "");
            }
        }
        return rs;
    }
}

