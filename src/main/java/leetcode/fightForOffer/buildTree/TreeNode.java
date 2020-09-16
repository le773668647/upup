package leetcode.fightForOffer.buildTree;

/**
 * @author liangze
 * @create 2020-06-22 下午12:28
 */
public class TreeNode {
    /**
     * 当前节点的值
     */
    int val;

    /**
     * 左子树
     */
    TreeNode left;

    /**
     * 右子树
     */
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
