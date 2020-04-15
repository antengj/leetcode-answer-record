/**
 * @title 1295. 统计位数为偶数的数字
 * @link https://leetcode-cn.com/problems/find-numbers-with-even-number-of-digits/
 * @description
 *      给你一个整数数组 nums，请你返回其中位数为 偶数 的数字的个数。 
 *
 *      示例 1： 
 *      输入：nums = [12,345,2,6,7896]
 *      输出：2
 *      解释：
 *      12 是 2 位数字（位数为偶数） 
 *      345 是 3 位数字（位数为奇数）  
 *      2 是 1 位数字（位数为奇数） 
 *      6 是 1 位数字 位数为奇数） 
 *      7896 是 4 位数字（位数为偶数）  
 *      因此只有 12 和 7896 是位数为偶数的数字
 *
 *      示例 2： 
 *      输入：nums = [555,901,482,1771]
 *      输出：1 
 *      解释： 
 *      只有 1771 是位数为偶数的数字。
 *
 *      提示： 
 *      1 <= nums.length <= 500 
 *      1 <= nums[i] <= 10^5
 * @topic 数组
 */
package cc.techtips.leetcode.editor.cn;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        Solution solution = new FindNumbersWithEvenNumberOfDigits().new Solution();
        System.out.println(solution.findNumbers(new int[]{12,345,2,6,7896}));
        System.out.println(solution.findNumbers(new int[]{555,901,482,1771}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * 解题思路:
     *   遍历, 将int转为String, 然后看字符长度是奇数还是偶数
     * 结果:
     *   执行耗时:2 ms,击败了74.36% 的Java用户
     *   内存消耗:39.5 MB,击败了5.88% 的Java用户
     */
    class Solution {
        public int findNumbers(int[] nums) {

            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (Integer.toString(nums[i]).length() % 2 == 0)
                    count++;
            }
            return count;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}