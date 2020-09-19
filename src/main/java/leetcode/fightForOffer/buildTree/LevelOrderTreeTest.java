package leetcode.fightForOffer.buildTree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liangze
 * 剑指 Offer 32 - I. 从上到下打印二叉树
 * 思路: 层次遍历  需要准备一个容器将每个结点单独存储
 *      1.遍历树  将
 * @create 2020-09-18 下午3:13
 */
public class LevelOrderTreeTest {
    //存储结点的list
    List<TreeNode> nodeList = new ArrayList<>();
    //树:即传入参数 要全局操作  所以定义在方法外面
    TreeNode init;

    public int[] levelOrder(TreeNode root) {
        init = root;
        int[] res = new int[0];
        if (root == null) {
            return res;
        }
        //方法入口  引入递归
        getTree();
        //拼装返回值
        res = new int[nodeList.size()];
        for (int i = 0; i < nodeList.size(); i++) {
            res[i] =  nodeList.get(i).val;
        }
        return res;
    }

    private void getTree() {
        //null说明当前结点已经没了
        if (nodeList == null){
            return;
        }
        //此部分是为了第一次递归时候设值
        if (nodeList.size() == 0){
            nodeList.add(init);
        }
        if (nodeList.size()>0){
            //i正常自增  nodeList会一直变大,直到所有结点被加入
            for (int i =0;i<nodeList.size();i++){
                TreeNode node = nodeList.get(i);
                if (node.left != null){
                    nodeList.add(node.left);
                }
                if (node.right != null){
                    nodeList.add(node.right);
                }
            }
        }
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
        LevelOrderTreeTest test = new LevelOrderTreeTest();
        int[] ints = test.levelOrder(node3);
        for (int i = 0;i<ints.length;i++){
            System.out.println(ints[i]);
        }
    }
}
