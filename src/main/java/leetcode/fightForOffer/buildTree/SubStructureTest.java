package leetcode.fightForOffer.buildTree;

/**
 * @author zzzz
 * @create 2020-06-18 下午7:53
 * 剑指offer26 树的子结构
 */
public class SubStructureTest {
    //遍历树
    public boolean isSubStructure(TreeNode a, TreeNode b) {
        boolean result = false;
        if (a == null || b == null) {
            return false;
        }
        if (a.val == b.val) {
            //根相同时,校验子树
            result = checkSubTree(a.left, b.left) && checkSubTree(a.right, b.right);
        }
        //校验子树,遍历左子树,遍历右子树,三者有一个为true则表示包含b
        return result || isSubStructure(a.left, b) || isSubStructure(a.right, b);

    }

    private boolean checkSubTree(TreeNode a, TreeNode b) {
        //表示b接下来已经没有,a>b 表示包含
        if (b == null) {
            return true;
        }
        //此处标识b不为null a为null,说明a<b 不包含
        if (a == null) {
            return false;
        }
        //节点值相同时,遍历校验子节点
        if (a.val == b.val) {
            return checkSubTree(a.left, b.left) && checkSubTree(a.right, b.right);
        }
        return false;
    }
}
