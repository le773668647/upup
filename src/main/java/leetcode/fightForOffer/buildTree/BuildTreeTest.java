package leetcode.fightForOffer.buildTree;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zzzz
 * 重建二叉树 前序遍历和中序遍历
 * @create 2020-06-22 下午12:28
 */
public class BuildTreeTest {
    //存放前序遍历数组
    int[] po;
    //存放中序遍历的值和index
    Map<Integer, Integer> indexMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        po = preorder;
        for (int i = 0; i < inorder.length; i++) {
            indexMap.put(inorder[i], i);
        }
        return buildTree(0, 0, inorder.length - 1);

    }

    /**
     * @param pre_root_idx 前序遍历下根节点的index
     * @param in_left_idx  中序遍历下最左节点index
     * @param in_right_idx 中序遍历下最右节点的index
     * @return
     */
    private TreeNode buildTree(int pre_root_idx, int in_left_idx, int in_right_idx) {
        //子树的左边界大于右边界说明已经没有了
        if (in_left_idx > in_right_idx) {
            return null;
        }
        //创建根节点,为根赋值
        TreeNode root = new TreeNode(po[pre_root_idx]);
        //拿到中序遍历根的index
        int rootIndexOfInorder = indexMap.get(po[pre_root_idx]);
        root.left = buildTree(pre_root_idx + 1, in_left_idx, rootIndexOfInorder - 1);
        //右子树的根 = 当前根 + 左子树的长度
        //中序遍历右子数的左边界 = 中序遍历下根 + 1
        root.right = buildTree(pre_root_idx + (rootIndexOfInorder - in_left_idx) + 1, rootIndexOfInorder + 1, in_right_idx);
        return root;
    }

    public static void main(String[] args) {
        int [] a = {3,9,20,15,7};
        int [] b = {9,3,15,20,7};
        BuildTreeTest test = new BuildTreeTest();
        test.buildTree(a,b);
    }
}
