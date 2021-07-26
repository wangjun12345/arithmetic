package com.wac.arithmetic.question;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author wj
 * @Description: 正则表达式匹配
 * 给你一个字符串 s 和一个字符规律 p，请你来实现一个支持 '.' 和 '*' 的正则表达式匹配。
 * '.' 匹配任意单个字符
 * '*' 匹配零个或多个前面的那一个元素
 * 所谓匹配，是要涵盖 整个 字符串 s的，而不是部分字符串
 *
 * @date 2021/7/21 10:40 上午
 */
public class Question0010C {
    public static void main(String[] args) {
        String s = "ab";
        String p = "a*";
        boolean rs = t1(s, p);
        System.out.println(rs);
    }

    //todo
    private static boolean t1(String s, String p) {
        return false;
    }
}
