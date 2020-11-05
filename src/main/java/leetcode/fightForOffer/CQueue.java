package leetcode.fightForOffer;

import java.util.Stack;

/**
 * @author liangze
 * 两个栈来回倒,栈1的弹出顺序压入栈二,弹出栈二的第一个,再挨个弹出并压入栈1
 * @create 2020-10-28 下午7:29
 */
public class CQueue {
    private Stack<Integer> stack1;

    //pop弹出栈顶元素 push压栈
    private Stack<Integer> stack2;
    public CQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        int result;
        if (stack1.empty()){
            return -1;
        }
        while (!stack1.empty()){
            stack2.push(stack1.pop());
        }
        result = stack2.pop();
        while (!stack2.empty()){
            stack1.push(stack2.pop());
        }
        return result;
    }
}
