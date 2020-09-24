package leetcode.fightForOffer.buildTree;

import java.util.*;

/**
 * @author liangze
 * 剑指 Offer 32 - III. 从上到下打印二叉树 II
 * 思路: 层次遍历  需要准备一个容器将每个结点单独存储
 *      其他同剑指 Offer 32 - II,只是多加了一个变量去维护正序还是倒叙
 * @create 2020-09-24 上午10:23
 */
public class LevelOrderTreeTest3 {
    //存储结点的list
    Queue<TreeNode> queue = new LinkedList<>();
    //树:即传入参数 要全局操作  所以定义在方法外面
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null){
            return res;
        }
        queue.add(root);
        int target = 1;
        while (!queue.isEmpty()){
            List<Integer> data = new ArrayList<>();
            //单独为根结点设立
            int j = queue.size();
            for (int i = 0; i < j; i++) {
                TreeNode node = queue.poll();
                data.add(node.val);
                        if (node.left != null) {
                            queue.add(node.left);
                        }
                        if (node.right != null) {
                            queue.add(node.right);
                        }
                }
            target++;
            switch (target % 2){
                case 0: break;
                case 1:  Collections.reverse(data);break;
            }
            res.add(data);
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode node4= new TreeNode(4);
        node4.left=null;
        node4.right=null;
        TreeNode node5= new TreeNode(5);
        node5.left=null;
        node5.right=null;
        TreeNode node2= new TreeNode(2);
        node2.left=node4;
        node2.right=null;
        TreeNode node3= new TreeNode(3);
        node3.left=null;
        node3.right=node5;
        TreeNode node1= new TreeNode(1);
        node1.left=node2;
        node1.right=node3;
        LevelOrderTreeTest3 test = new LevelOrderTreeTest3();
        List<List<Integer>> lists = test.levelOrder(node1);
        System.out.println(lists);
    }

}
