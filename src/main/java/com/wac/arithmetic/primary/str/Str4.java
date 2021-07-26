package com.wac.arithmetic.primary.str;

import java.util.*;

/**
 * @author wj
 * @Description: 有效的字母异位词
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词
 * 即两个字符串里的包含的元素是否一样，不考虑顺序
 * @date 2021/6/21 10:24 上午
 */
public class Str4 {

    public static void main(String[] args) {

        String s = "abcc";
        String t = "bcca";
        boolean rs = t2(s, t);
//        boolean rs = t1(s, t);
        System.out.println(rs);
    }

    private static boolean t2(String s, String t) {
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();
        Arrays.sort(arrS);
        Arrays.sort(arrT);
        return Arrays.equals(arrS, arrT);
    }


    private static boolean t1(String s, String t) {
        Map<String, Integer> map = new HashMap<>();
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();
        if(arrS.length != arrT.length){
            return false;
        }
        for (char arr : arrS) {
            map.put(arr+"", map.getOrDefault(arr + "", 0) + 1);
        }

        for (char c : arrT) {
            Integer cnt = map.get(c + "");
            if(cnt == null || cnt == 1){
                map.remove(c + "");
            }else{
                map.put(c +"", --cnt);
            }
        }
        return map.size() == 0;
    }
}
