package leetcode.fightForOffer.buildTree;

/**
 * @author zzzz
 * @create 2020-06-18 下午7:53
 * 剑指offer27 镜像二叉树
 */
public class MirrorTreeTest {
    public TreeNode mirrorTree(TreeNode root) {
        //根为空直接返回
        if(root == null ){
            return root;
        }
        //声明临时变量,不然会覆盖的
        TreeNode left=root.left;
        TreeNode right=root.right;
        //递归交换
        root.left = mirrorTree(right);
        root.right = mirrorTree(left);
        return root;

    }


}
