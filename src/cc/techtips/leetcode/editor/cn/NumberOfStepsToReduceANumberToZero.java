/**
 * @title 1342. 将数字变成 0 的操作次数
 * @link https://leetcode-cn.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 * @description
 *      给你一个非负整数 num ，请你返回将它变成 0 所需要的步数。 如果当前数字是偶数，你需要把它除以 2 ；否则，减去 1 。
 *
 *      示例 1：
 *      输入：num = 14
 *      输出：6
 *      解释：
 *      步骤 1) 14 是偶数，除以 2 得到 7 。
 *      步骤 2） 7 是奇数，减 1 得到 6 。
 *      步骤 3） 6 是偶数，除以 2 得到 3 。
 *      步骤 4） 3 是奇数，减 1 得到 2 。
 *      步骤 5） 2 是偶数，除以 2 得到 1 。
 *      步骤 6） 1 是奇数，减 1 得到 0 。
 *
 *      示例 2：
 *      输入：num = 8
 *      输出：4
 *      解释：
 *      步骤 1） 8 是偶数，除以 2 得到 4 。
 *      步骤 2） 4 是偶数，除以 2 得到 2 。
 *      步骤 3） 2 是偶数，除以 2 得到 1 。
 *      步骤 4） 1 是奇数，减 1 得到 0 。
 *
 *      示例 3：
 *      输入：num = 123
 *      输出：12
 *
 *      提示：
 *      0 <= num <= 10^6
 * @topic 位运算
 */
package cc.techtips.leetcode.editor.cn;

public class NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
        Solution solution = new NumberOfStepsToReduceANumberToZero().new Solution();
        System.out.println(solution.numberOfSteps(14));
        System.out.println(solution.numberOfSteps(8));
        System.out.println(solution.numberOfSteps(123));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * 解题思路:
     *   循环, 直到num=0
     *   偶数除2, 奇数减1
     *   step++
     * 结果:
     *   执行耗时:1 ms,击败了42.55% 的Java用户
     *   内存消耗:36.4 MB,击败了100.00% 的Java用户
     */
    class Solution {
        public int numberOfSteps (int num) {

            int steps = 0;
            while (num > 0) {
                if(num % 2 == 0) {
                    num = num / 2;
                } else {
                    num = num - 1;
                }
                steps++;
            }
            return steps;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}