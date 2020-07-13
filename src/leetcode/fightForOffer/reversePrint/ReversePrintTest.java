package leetcode.fightForOffer.reversePrint;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author zzzz
 * @create 2020-06-19 下午5:09
 */
public class ReversePrintTest {
    public int[] reversePrint(ListNode head) {
    List<Integer> list=new ArrayList();
    while (head!=null){
        list.add(head.val);
        head=head.next;

    }
    int[] result=new int [list.size()];
    if (list.size()>0){
        for (int i = list.size(); i >0 ; i--) {
            result[list.size()-i] =list.get(i-1);
        }
    }
    return result;


    }

    public static void main(String[] args) {

    }

}
