package com.wac.arithmetic.question;

import java.util.*;

/**
 * @author wj
 * @Description: 无重复字符的最长子串
 * 给定一个字符串s，请你找出其中不含有重复字符的最长子串长度
 *
 * @date 2021/7/21 8:59 上午
 */
public class Question0003B {
    public static void main(String[] args) {
        String s = "ab";
        int rs = t2(s);
        System.out.println(rs);
    }

    /**
     * 滑动窗口
     */
    private static int t2(String s){
        if(s == null || s.length() == 0){
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        int max = 1;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            //从0 -> i位置 有个移动的left初始值0，最大子串就是left->i,遇到重复的就会给left赋新值，新值就是与该处字符相等的上一次出现的位置
            if(map.containsKey(s.charAt(i))){
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }


    /**
     * 从第一个位置开始往后遍历，找出最大子串
     */
    private static int t1(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        int maxLen = 1;
        List<Character> list = new LinkedList<>();
        for (int i = 1; i < s.length(); i++) {
            list.add(s.charAt(i - 1));
            for (int j = i; j < s.length(); j++) {
                if(list.contains(s.charAt(j))){
                    break;
                }
                list.add(s.charAt(j));
            }
            if(maxLen < list.size()){
                maxLen = list.size();
            }
            //达到最大长度时就不再往后面遍历
            if(maxLen >= s.length() - i){
                return maxLen;
            }
            list.clear();
        }
        return maxLen;
    }


}
