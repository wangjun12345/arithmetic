package com.wac.arithmetic.primary.str;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author wj
 * @Description: 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1
 * @date 2021/6/21 9:59 上午
 */
public class Str3 {
    public static void main(String[] args) {
        String s = "aabb";
        int rs = t2(s);
        System.out.println(rs);
    }

    private static int t2(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if(s.indexOf(chars[i]) == s.lastIndexOf(chars[i])){
                return i;
            }
        }
        return -1;
    }


    private static int t1(String s) {
        char[] chars = s.toCharArray();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if(map.containsKey(chars[i] + "")){
                map.put(chars[i] + "", map.get(chars[i] + "") + 1);
            }else{
                map.put(chars[i] + "", 1);
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if(map.get(chars[i] + "") == 1){
                return i;
            }
        }
        return -1;
    }
}
