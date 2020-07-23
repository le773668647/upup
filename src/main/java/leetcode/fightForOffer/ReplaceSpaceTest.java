package leetcode.fightForOffer;

import sun.font.FontRunIterator;

/**
 * @author zzzz
 * @create 2020-06-18 下午7:53
 *
 * 剑指offer05 替换字符串的空格
 */
public class ReplaceSpaceTest {
    public String replaceSpace(String s) {

        return s.replaceAll(" ","%20");

    }
    public static void main (String[]args){
        String a = "   ";
        ReplaceSpaceTest test = new ReplaceSpaceTest();

        System.out.println(test.replaceSpace(a));
    }
}
