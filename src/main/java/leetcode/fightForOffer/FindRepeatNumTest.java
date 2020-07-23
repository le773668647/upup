package leetcode.fightForOffer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zzzz
 * @create 2020-06-18 上午11:49
 */
public class FindRepeatNumTest {
    /**
     * 剑指offer
     * 面试题03
     * 数组中重复的数字
     * 思路:利用hashmap去重
     * @param nums
     * @return
     */
    public int findRepeatNumTest(int[] nums){
        Map hash=new HashMap();
        List result =null;
        if (nums.length>0){
            for (int i = 0; i < nums.length; i++) {
                if (hash.containsKey(nums[i])){
                    hash.put(nums[i],(int)hash.get(nums[i])+1);
                    result=new ArrayList();
                    result.add(nums[i]);
                }else{
                    hash.put(nums[i],1);
                }
            }
        }
        if (result.size()>0){

            return (int)result.get(0);
        }else {
            return 0;

        }
    }

    public static void main(String[] args) {
        int [] s={1,5,4,3,7,7};
        FindRepeatNumTest test=new FindRepeatNumTest();
        System.out.println(test.findRepeatNumTest(s));
    }
}
