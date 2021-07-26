package com.wac.arithmetic.primary.str;

/**
 * @author wj
 * @Description: 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * @date 2021/6/23 1:12 下午
 */
public class Str8 {

    public static void main(String[] args) {
        String[] strs = {"a"};
//        String[] strs = {"hello", "help", "heap"};
        String rs = t2(strs);
//        String rs = t1(strs);
        System.out.println(rs);

    }

    /**
     * 从最长慢慢变短
     */
    private static String t2(String[] strs) {
        String commonStr = strs[0];
        while(commonStr.length() > 0){
            boolean pass = true;
            for (int i = 1; i < strs.length; i++) {
                if(!strs[i].startsWith(commonStr)){
                    commonStr = commonStr.substring(0, commonStr.length() - 1);
                    pass = false;
                }
            }
            if(pass){
                return commonStr;
            }
        }
        return commonStr;
    }

    /**
     * 从最短慢慢变长
     */
    private static String t1(String[] strs) {
        if(strs[0].trim().length() == 0){
            return "";
        }
        int len = 1;
        String commonStr = strs[0].charAt(0) + "";
        boolean isMaxLength = false;
        while(!isMaxLength){
            for (int i = 0; i < strs.length; i++) {
                if(strs[i].length() <= len){
                    isMaxLength = true;
                }
                if(!strs[i].startsWith(commonStr)){
                    return commonStr.substring(0, commonStr.length() - 1);
                }
            }
            if(!isMaxLength){
                len++;
                commonStr += strs[0].charAt(len - 1);
            }
        }
        return commonStr;
    }

    public String longestCommonPrefix(String[] strs) {
        //边界条件判断
        if (strs == null || strs.length == 0) {
            return "";
        }
        //默认第一个字符串是他们的公共前缀
        String pre = strs[0];
        int i = 1;
        while (i < strs.length) {
            //不断的截取
            while (strs[i].indexOf(pre) != 0) {
                pre = pre.substring(0, pre.length() - 1);
            }
            i++;
        }
        return pre;
    }
}
