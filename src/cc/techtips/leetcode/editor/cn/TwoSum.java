/**
 * @title 1. 两数之和
 * @link https://leetcode-cn.com/problems/two-sum/
 * @description
 *      给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
 *      你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *      示例:
 *      给定 nums = [2, 7, 11, 15], target = 9
 *      因为 nums[0] + nums[1] = 2 + 7 = 9, 所以返回 [0, 1]
 * @topic 数组, 哈希表
 */
package cc.techtips.leetcode.editor.cn;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new TwoSum().new Solution();
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{0, 4, 3, 0}, 0)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{-3, 4, 3, 90}, 0)));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * 解题思路:
     *   遍历数组, 第一个数字和后面的所有数字尝试相加, 是否等于target
     *   如果有, 则返回这两个数字的索引
     *   如果没有, 则从第二个数字开始和后面的所有数字尝试相加, 直到最后一个数字
     * 结果:
     *   执行耗时:69 ms,击败了24.52% 的Java用户
     *   内存消耗:40.1 MB,击败了5.06% 的Java用户
     */
    class Solution {
        public int[] twoSum(int[] nums, int target) {

            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        int[] rel = new int[2];
                        rel[0] = i;
                        rel[1] = j;
                        return rel;
                    }
                }
            }
            return null;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}