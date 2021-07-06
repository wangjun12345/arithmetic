package com.wac.arithmetic.primary.str;

/**
 * @author wj
 * @Description: 实现 strStr() 函数。
 * 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回  -1
 * @date 2021/6/23 1:00 下午
 */
public class Str7 {

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "cc";
        int rs = t1(haystack, needle);
        System.out.println(rs);
    }

    private static int t1(String haystack, String needle) {
//        if(needle.trim().length() == 0){
//            return 0;
//        }
        int rs = -1;
        rs =  haystack.indexOf(needle);

        return rs;
    }
}
