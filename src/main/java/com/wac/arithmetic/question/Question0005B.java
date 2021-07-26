package com.wac.arithmetic.question;

/**
 * @author wj
 * @Description: 最长回文子串
 * 中心扩散：
 * 遍历每个位置，以该位置为中心，向左右扩散，找出最长的回文串，最后取出最大值
 * @date 2021/7/19 1:16 下午
 */
public class Question0005B {
    public static void main(String[] args) {
        String s = "cbbd";
        String rs = t1(s);
        System.out.println(rs);
    }

    /**
     * 中心扩散优化版
     */
//    private static String t2(String s){
//        if (s == null || s.length() == 0){
//            return "";
//        }
//        int strLen = s.length();
//        int maxLen = 1;
//        int start = 0;
//        boolean[][] dp = new boolean[strLen][strLen];
//        for (int r = 1; r < strLen; r++) {
//            for (int l = 0; l < r; l++) {
//                if (s.charAt(l) == s.charAt(r)){
//
//                }
//            }
//        }
//

//    }

    /**
     * 中心扩散简单版
     */
    private static String t1(String s) {
        if (s == null || s.length() == 0){
            return "";
        }
        int strLen = s.length();
        int left = 0;
        int right;
        int maxLen = 1;
        int start = 0;
        for (int i = 0; i < strLen; i++) {
            left = i - 1;
            right = i + 1;
            int len = 1;
            while(left >= 0 && s.charAt(left) == s.charAt(i)){
                len++;
                left--;
            }
            while(right < strLen && s.charAt(right) == s.charAt(i)){
                len++;
                right++;
            }
            while(left >= 0 && right < strLen && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
                len += 2;
            }
            if(len > maxLen){
                maxLen = len;
                start = left + 1;
            }
        }
        return s.substring(start, start + maxLen);
    }
}
