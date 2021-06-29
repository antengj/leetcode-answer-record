package cc.techtips.leetcode.editor.cn;

import java.util.Arrays;

/**
 * @title 面试题 16.01. 交换数字
 * @link https://leetcode-cn.com/problems/swap-numbers-lcci/
 * @description
 *      编写一个函数，不用临时变量，直接交换numbers = [a, b]中a与b的值。
 *
 *      示例：
 *      输入: numbers = [1,2]
 *      输出: [2,1]
 *
 *      提示：
 *      numbers.length == 2
 * @tags 位运算 数学
 */
public class SwapNumbersLcci {
    public static void main(String[] args) {
        Solution solution = new SwapNumbersLcci().new Solution();
        System.out.println(Arrays.toString(solution.swapNumbers(new int[]{1,2})));
        System.out.println(Arrays.toString(solution.swapNumbers(new int[]{1,5})));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * 解题思路:
     *   按位异或
     * 结果:
     *   执行耗时:0 ms,击败了100.00% 的Java用户
     *   内存消耗:37.6 MB,击败了100.00% 的Java用户
     */
    class Solution {
        public int[] swapNumbers(int[] numbers) {

            numbers[0] ^= numbers[1];
            numbers[1] ^= numbers[0];
            numbers[0] ^= numbers[1];
            return numbers;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}