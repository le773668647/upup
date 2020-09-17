package leetcode.fightForOffer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liangze
 * 斐波那契数列 递归解决
 * @create 2020-09-17 上午11:27
 */
public class Fib {
    //为了防止结果移溢出,需要对结果取余数
    int constant = 1000000007;

    public int fib(int n) {
        Map<Integer, Integer> map = new HashMap();
        return getNumber(n, map);
    }

    public int getNumber(int n, Map<Integer, Integer> map) {
        int a;
        int b;
        if (n < 0) {
            return n;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        }
        if (n < 2) {
            return n;
        }
        if (map.containsKey(n - 1)) {
            a = map.get(n - 1);
        } else {
            a = getNumber(n - 1, map) % constant;
            map.put(n - 1, a);
        }
        if (map.containsKey(n - 2)) {
            b = map.get(n - 2);
        } else {
            b = getNumber(n - 2, map) % constant;
            map.put(n - 2, b);
        }
        int res = a+b;
        map.put(n, res);
        return res;
    }
}
