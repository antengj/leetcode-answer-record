package cc.techtips.leetcode.editor.cn;

/**
 * @title LCP 06. 拿硬币
 * @link https://leetcode-cn.com/problems/na-ying-bi/
 * @description
 *      桌上有 n 堆力扣币，每堆的数量保存在数组 coins 中。我们每次可以选择任意一堆，拿走其中的一枚或者两枚，求拿完所有力扣币的最少次数。
 *
 *      示例 1：
 *      输入：[4,2,1]
 *      输出：4
 *      解释：第一堆力扣币最少需要拿 2 次，第二堆最少需要拿 1 次，第三堆最少需要拿 1 次，总共 4 次即可拿完。
 *
 *      示例 2：
 *      输入：[2,3,10]
 *      输出：8
 *
 *      限制：
 *      1 <= n <= 4
 *      1 <= coins[i] <= 10
 * @tags 数组, 数学
 */
public class NaYingBi {
    public static void main(String[] args) {
        Solution solution = new NaYingBi().new Solution();
        System.out.println(solution.minCount(new int[]{4,2,1}));
        System.out.println(solution.minCount(new int[]{2,3,10}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * 解题思路:
     *   +1后取整
     * 结果:
     *   执行耗时:0 ms,击败了100.00% 的Java用户
     *   内存消耗:36.7 MB,击败了100.00% 的Java用户
     */
    class Solution {
        public int minCount(int[] coins) {
            int count = 0;
            for (int i = 0; i < coins.length; i++) {
                count += (coins[i] + 1) / 2;
            }
            return count;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}