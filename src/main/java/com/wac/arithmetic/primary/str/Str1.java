package com.wac.arithmetic.primary.str;

/**
 * @author wj
 * @Description: 反转字符串
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符
 * @date 2021/6/21 9:04 上午
 */
public class Str1 {
    public static void main(String[] args) {
        char[] s = {'a', 'b', 'c', 'd', 'e'};
        t2(s);
//        t1(s);
    }

    private static void t2(char[] s) {
        int left = 0;
        int right = s.length -1;
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        System.out.println(s);
    }

    private static void t1(char[] s) {
        for (int i = 0; i < s.length/2; i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 -i];
            s[s.length -1 - i] = temp;
        }
        System.out.println(s);
    }


}
