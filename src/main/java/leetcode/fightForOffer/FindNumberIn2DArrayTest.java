package leetcode.fightForOffer;

/**
 * @author zzzz
 * @create 2020-06-18 下午12:27
 *
 * 剑指offer面试题 04 二维数组查找
 */
public class FindNumberIn2DArrayTest {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        for (int i = matrix.length; i >0; i--) {
            for (int j = matrix[i-1].length; j >0 ; j--) {
                if (matrix[i-1][j-1]<target){
                    continue;
                }else if(matrix[i-1][j-1]==target){
                    return true;
                }
            }

        }
        return false;

    }

    public static void main(String[] args) {

        int[][] matrix= {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        FindNumberIn2DArrayTest test=new FindNumberIn2DArrayTest();
        System.out.println(test.findNumberIn2DArray(matrix,5));
    }
}
