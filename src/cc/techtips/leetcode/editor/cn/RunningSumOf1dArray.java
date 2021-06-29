package cc.techtips.leetcode.editor.cn;

import java.util.Arrays;

/**
 * @title 5436. 一维数组的动态和
 * @link https://leetcode-cn.com/problems/running-sum-of-1d-array/
 * @description
 *      给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
 *      请返回 nums 的动态和。
 *
 *      示例 1：
 *      输入：nums = [1,2,3,4]
 *      输出：[1,3,6,10]
 *      解释：动态和计算过程为 [1, 1+2, 1+2+3, 1+2+3+4] 。
 *
 *      示例 2：
 *      输入：nums = [1,1,1,1,1]
 *      输出：[1,2,3,4,5]
 *      解释：动态和计算过程为 [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1] 。
 *
 *      示例 3：
 *      输入：nums = [3,1,2,10,1]
 *      输出：[3,4,6,16,17]
 *
 *      提示：
 *      1 <= nums.length <= 1000
 *      -10^6 <= nums[i] <= 10^6
 * @tags 数组
 */
public class RunningSumOf1dArray {
    public static void main(String[] args) {
        Solution solution = new RunningSumOf1dArray().new Solution();
        System.out.println(Arrays.toString(solution.runningSum(new int[]{1,2,3,4})));
        System.out.println(Arrays.toString(solution.runningSum(new int[]{1,1,1,1,1})));
        System.out.println(Arrays.toString(solution.runningSum(new int[]{3,1,2,10,1})));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] runningSum(int[] nums) {
            // pre表示i位置的数字之前的和
            // 比如[1,2,3,4], i=0的位置, pre是0. 然后改变i的值为nums[0] + 0;
            // 那此时i的值就是i+1前面的所有数字的和了. 以此类推
            int pre = 0;
            for (int i = 0; i < nums.length; i++) {
                nums[i] = nums[i] + pre;
                pre = nums[i];
            }
            return nums;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}