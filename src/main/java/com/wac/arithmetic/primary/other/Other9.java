package com.wac.arithmetic.primary.other;

import java.util.*;

/**
 * @author wj
 * @Description: 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * @date 2021/7/16 11:06 上午
 */
public class Other9 {

    public static void main(String[] args) {
//        boolean rs = t1("{}[]");
        boolean rs = t2("{}[]");
        System.out.println(rs);
    }

    private static boolean t2(String s) {
        char[] chars = s.toCharArray();
        if(chars.length % 2 == 1){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> fhMap = new HashMap<>();
        fhMap.put('[', ']');
        fhMap.put('{', '}');
        fhMap.put('(', ')');
        for (char c : chars) {
            if(fhMap.containsKey(c)){
                stack.push(c);
                continue;
            }
            if(stack.isEmpty() || fhMap.get(stack.pop()) != c){
                return false;
            }
        }
        return stack.isEmpty();
    }


    private static boolean t1(String s) {
        char[] chars = s.toCharArray();
        if(chars.length % 2 == 1){
            return false;
        }
        Map<Character, Character> fhMap = new HashMap<>();
        fhMap.put('[', ']');
        fhMap.put('{', '}');
        fhMap.put('(', ')');
        List<Character> list = new ArrayList<>(chars.length / 2);
        for (int i = 0; i < chars.length; i++) {
            if(fhMap.containsKey(chars[i])){
                list.add(chars[i]);
                continue;
            }
            if(list.size() == 0 || fhMap.get(list.get(list.size() - 1)) != chars[i]){
                return false;
            }else{
                list.remove(list.size() - 1);
            }
        }
        return list.size() == 0;
    }
}
