/**
 * @title 1281. 整数的各位积和之差
 * @link https://leetcode-cn.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 * @description
 *      给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
 *
 *      示例 1： 
 *      输入：n = 234
 *      输出：15
 *      解释：
 *      各位数之积 = 2 * 3 * 4 = 24
 *      各位数之和 = 2 + 3 + 4 = 9
 *      结果 = 24 - 9 = 15
 *
 *      示例 2： 
 *      输入：n = 4421
 *      输出：21
 *      解释：
 *      各位数之积 = 4 * 4 * 2 * 1 = 32
 *      各位数之和 = 4 + 4 + 2 + 1 = 11
 *      结果 = 32 - 11 = 21
 *      
 *      提示：
 *      1 <= n <= 10^5
 * @topic 数学
 */
package cc.techtips.leetcode.editor.cn;

public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    public static void main(String[] args) {
        Solution solution = new SubtractTheProductAndSumOfDigitsOfAnInteger().new Solution();
        System.out.println(solution.subtractProductAndSum(234));
        System.out.println(solution.subtractProductAndSum(4421));
    }

    /**
     * 解题思路:
     *   将数字转为字符串, 再一个一个分割为单个的数字
     * 结果:
     *   执行耗时:0 ms,击败了100.00% 的Java用户
     *   内存消耗:36.5 MB,击败了6.06% 的Java用户
     */
    class Solution_1 {
        public int subtractProductAndSum(int n) {

            String number = String.valueOf(n);
            int x = 1;
            int y = 0;

            for(int i = 0; i < number.length(); i++)  {
                int j = Character.getNumericValue(number.charAt(i));
                x *= j;
                y += j;
            }
            return x - y;
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * 解题思路:
     *   通过取模, 取出每个数字
     * 结果:
     *   执行耗时:0 ms,击败了100.00% 的Java用户
     *   内存消耗:36.6 MB,击败了6.06% 的Java用户
     */
    class Solution {
        public int subtractProductAndSum(int n) {
            int x = 1;
            int y = 0;
            while (n > 0) {
                int a = n % 10;
                n = n / 10;
                x *= a;
                y += a;
            }
            return x - y;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}