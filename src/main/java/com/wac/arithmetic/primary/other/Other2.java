package com.wac.arithmetic.primary.other;

/**
 * @author wj
 * @Description: 爬楼梯  斐波那契额数列
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 可以从最后一步考虑，最后一步要不一个台阶，要不两个台阶
 * 一个台阶：达到n-1有f(n-1)种方法
 * 两个台阶：达到n-2有f(n-2)种方法
 * 所有 f(n) = f(n-1) - f(n-2)
 *
 * @date 2021/7/8 7:40 下午
 */
public class Other2 {
    public static void main(String[] args) {
        int rs = t4(10);
//        int rs = t3(10);
//        int rs = t2(10);
//        int rs = t1(10);
        System.out.println(rs);
    }

    private static int t2(int n) {
        int firstSum = 1;
        int secondSum = 1;
        return f1(n, firstSum, secondSum);

    }

    private static int f1(int n, int firstSum, int secondSum) {
        if(n == 1){
            return secondSum;
        }
        return f1(n-1, secondSum, firstSum + secondSum);
    }


    private static int t1(int n) {
        if(n <= 1){
            return 0;
        }
        if(n < 3){
            return n;
        }
        return t1(n - 1) + t1(n - 2);
    }

    /**
     * 非递归
     */
    private static int t3(int n) {
        if(n <= 1){
            return 1;
        }
        int[] sums = new int[n + 1];
        sums[1] = 1;
        sums[2] = 2;
        for (int i = 3; i <= n; i++) {
            sums[i] = sums[i - 1] + sums[i - 2];
        }
        return sums[n];
    }

    /**
     * 非递归优化，不用数组，只要两个临时变量即可
     */
    private static int t4(int n) {
        if(n <= 1){
            return 1;
        }
        int temp1 = 1;
        int temp2 = 2;
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = temp1 + temp2;
            temp1 = temp2;
            temp2 = sum;
        }
        return sum;
    }
}
