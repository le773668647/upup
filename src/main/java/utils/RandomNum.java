package utils;

import java.util.HashSet;
import java.util.Set;

/**
 * @author liangze
 * @create 2020-08-25 下午2:36
 */
public class RandomNum {

    private HashSet<Integer> getRandomIds(int min, int max, int n, HashSet<Integer> set) {
        if (n > (max - min + 1) || max < min) {
            return null;
        }
        for (int i = 0; i < n; i++) {
            // 调用Math.random()方法
            int num = (int) (Math.random() * (max - min)) + min;
            set.add(num);// 将不同的数存入HashSet中
        }
        int setSize = set.size();
        // 如果存入的数小于指定生成的个数，则调用递归再生成剩余个数的随机数，如此循环，直到达到指定大小
        if (setSize < n) {
            getRandomIds(min, max, n - setSize, set);// 递归
        }
        return set;
    }

    public static void main(String[] args) {
        RandomNum randomNum = new RandomNum();
        HashSet<Integer> hashSet = new HashSet();
        hashSet = randomNum.getRandomIds(1, 100, 5, hashSet);
        System.out.println(hashSet);
    }
}
