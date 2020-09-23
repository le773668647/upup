package leetcode.fightForOffer.buildTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author liangze
 * 剑指 Offer 32 - II. 从上到下打印二叉树 II
 * 思路: 层次遍历  需要准备一个容器将每个结点单独存储
 * @create 2020-09-22 下午3:13
 */
public class LevelOrderTreeTest2 {
    //存储结点的list
    Queue<TreeNode> queue = new LinkedList<>();
    //树:即传入参数 要全局操作  所以定义在方法外面
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null){
            return res;
        }
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> data = new ArrayList<>();
            //单独为根结点设立
            int j = queue.size();
            for (int i = 0; i < j; i++) {
                TreeNode node = queue.poll();
                data.add(node.val);
                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
            }
            res.add(data);

        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode node15= new TreeNode(15);
        node15.left=null;
        node15.right=null;
        TreeNode node7= new TreeNode(7);
        node7.left=null;
        node7.right=null;
        TreeNode node20= new TreeNode(20);
        node20.left=node15;
        node20.right=node7;
        TreeNode node9= new TreeNode(9);
        node9.left=null;
        node9.right=null;
        TreeNode node3= new TreeNode(3);
        node3.left=node9;
        node3.right=node20;
        LevelOrderTreeTest2 test = new LevelOrderTreeTest2();
        List<List<Integer>> lists = test.levelOrder(node3);
        System.out.println(lists);
    }

}
