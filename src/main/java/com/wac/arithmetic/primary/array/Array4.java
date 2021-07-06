package com.wac.arithmetic.primary.array;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wj
 * @Description: 存在重复元素
 * 给定一个整数数组，判断是否存在重复元素。
 * 如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false
 * @date 2021/5/29 8:39 上午
 */
public class Array4 {

    @Test
    public void t1(){
        int[] array = {1,2,3,4,5};
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i : array) {
            set.add(i);
        }
        System.out.println(set.size() != array.length);
    }
}
