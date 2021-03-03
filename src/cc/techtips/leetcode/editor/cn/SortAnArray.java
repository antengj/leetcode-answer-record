/**
 * @title 912. 排序数组
 * @link https://leetcode-cn.com/problems/sort-an-array/
 * @description
 *      给你一个整数数组 nums，请你将该数组升序排列。
 *
 *      示例 1：
 *      输入：nums = [5,2,3,1]
 *      输出：[1,2,3,5]
 *
 *      示例 2：
 *      输入：nums = [5,1,1,2,0,0]
 *      输出：[0,0,1,1,2,5]
 *
 *      提示：
 *      1 <= nums.length <= 50000
 *      -50000 <= nums[i] <= 50000
 * @tags
 */
package cc.techtips.leetcode.editor.cn;

import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {
        Solution solution = new SortAnArray().new Solution();
        System.out.println(Arrays.toString(solution.sortArray(new int[]{5, 2, 3, 1})));
        System.out.println(Arrays.toString(solution.sortArray(new int[]{5, 1, 1, 2, 0, 0})));
    }

    /**
     * 选择排序
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] sortArray(int[] nums) {
            int length = nums.length;
            for (int i = 0; i < length; i++) {
                int minIndex = i;
                for (int j = i + 1; j < length; j++) {
                    if (nums[j] < nums[minIndex]) {
                        minIndex = j;
                    }
                }
                int tmp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = tmp;
            }
            return nums;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}