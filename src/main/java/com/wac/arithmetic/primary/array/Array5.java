package com.wac.arithmetic.primary.array;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author wj
 * @Description: 只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * @date 2021/5/29 8:50 上午
 */
public class Array5 {

    public static void main(String[] args) {
//        int rs = t1();
        int rs = t2();
        System.out.println(rs);
    }

    /**
     * 使用额外空间O(n)
     * @return
     */
    public static int t1(){
        int[] arr = {1,2,2,3,1,4,5,5,4};
        Map<Integer, Integer> map = new HashMap();
        for (int i : arr) {
            if(map.containsKey(i)){
                map.remove(i);
            }else{
                map.put(i, 1);
            }
        }
        for (Integer integer : map.keySet()) {
            return integer;
        }
        return 0;
    }

    /**
     * 使用异或运算
     * 任何数和0做异或运算，结果仍然是原来的数，即 a^0 = a
     * 任何数和其自身做异或运算，结果是0，即 a^a = 0
     * 异或运算满足交换律和结合律，即 a^b^a = b^a^a = b^(a^a) = b^0 = b
     */
    public static int t2(){
        int[] nums = {1,2,2,3,1,4,5,5,4};
        int rs = 0;
        for (int num : nums) {
            rs ^= num;
        }
        return rs;
    }
}
