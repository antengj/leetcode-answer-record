package cc.techtips.leetcode.editor.cn;

/**
 * @title 1351. 统计有序矩阵中的负数
 * @link https://leetcode-cn.com/problems/count-negative-numbers-in-a-sorted-matrix/
 * @description
 *      给你一个 m * n 的矩阵 grid，矩阵中的元素无论是按行还是按列，都以非递增顺序排列。
 *      请你统计并返回 grid 中 负数 的数目。
 *
 *      示例 1：
 *      输入：grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
 *      输出：8
 *      解释：矩阵中共有 8 个负数。
 *
 *      示例 2：
 *      输入：grid = [[3,2],[1,0]]
 *      输出：0
 *
 *      示例 3：
 *      输入：grid = [[1,-1],[-1,-1]]
 *      输出：3
 *
 *      示例 4：
 *      输入：grid = [[-1]]
 *      输出：1
 *
 *      提示：
 *      m == grid.length
 *      n == grid[i].length
 *      1 <= m, n <= 100
 *      -100 <= grid[i][j] <= 100
 * @tags 数组, 二分查找
 */
public class CountNegativeNumbersInASortedMatrix {
    public static void main(String[] args) {
        Solution solution = new CountNegativeNumbersInASortedMatrix().new Solution();
        System.out.println(solution.countNegatives(new int[][]{{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}}));
        System.out.println(solution.countNegatives(new int[][]{{3,2},{1,0}}));
        System.out.println(solution.countNegatives(new int[][]{{1,-1},{-1,-1}}));
        System.out.println(solution.countNegatives(new int[][]{{-1}}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * 解题思路:
     *   循环数组, 当出现负数时, 因为是非递增顺序排列, 所以终止循环, 统计下后面还剩几个数字即可
     * 结果:
     *   执行耗时:0 ms,击败了100.00% 的Java用户
     * 	 内存消耗:39.6 MB,击败了100.00% 的Java用户
     */
    class Solution {
        public int countNegatives(int[][] grid) {

            int count = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] < 0) {
                        count = count + grid[i].length - j;
                        break;
                    }
                }
            }
            return count;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}