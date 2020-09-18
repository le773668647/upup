package leetcode.fightForOffer.buildTree;

/**
 * @author liangze
 * 思路: 1构造镜像树 参考剑指offer27 镜像二叉树
 *      2挨个校验结点 参数(TreeNode a,TreeNode b)
 *       比较的是a.left 和 b.right,a.right和b.left
 * @create 2020-09-18 下午3:13
 */
public class SymmetricTreeTest {
    public boolean isSymmetric(TreeNode root) {
        return checkTree(root,mirrorTree(root));
    }

    private boolean checkTree(TreeNode a,TreeNode b){
        if(a==null && b==null){
            return true;
        }
        if( (a == null && b !=null) || (a != null && b ==null)){
            return false;
        }
        return a.val== b.val && checkTree(a.left,b.right) && checkTree(a.right,b.left);

    }

    /**
     * 构造镜像树
     * @param root
     * @return
     */
    private TreeNode mirrorTree(TreeNode root) {
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
