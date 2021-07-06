package com.wac.arithmetic.primary.str;

/**
 * @author wj
 * @Description: 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写
 * @date 2021/6/21 1:25 下午
 */
public class Str5 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean rs = t1(s);
        System.out.println(rs);
    }

    private static boolean t1(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while(left < right){
            if(!Character.isLetterOrDigit(chars[left])){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(chars[right])){
                right--;
                continue;
            }
            if(chars[left] != chars[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
