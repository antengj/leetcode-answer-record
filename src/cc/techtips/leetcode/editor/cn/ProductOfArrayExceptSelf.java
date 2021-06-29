package cc.techtips.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @title 238. 除自身以外数组的乘积
 * @link https://leetcode-cn.com/problems/product-of-array-except-self/
 * @description
 *      给你一个长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output ，其中 output[i] 等于 nums 中除 nums[i] 之
 *      外其余各元素的乘积。
 *
 *      示例:
 *      输入: [1,2,3,4]
 *      输出: [24,12,8,6]
 *
 *      提示：题目数据保证数组之中任意元素的全部前缀元素和后缀（甚至是整个数组）的乘积都在 32 位整数范围内。
 *
 *      说明: 请不要使用除法，且在 O(n) 时间复杂度内完成此题。
 *
 *      进阶：
 *      你可以在常数空间复杂度内完成这个题目吗？（ 出于对空间复杂度分析的目的，输出数组不被视为额外空间。）
 * @tags 数组
 */
public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        Solution solution = new ProductOfArrayExceptSelf().new Solution();
        System.out.println(Arrays.toString(solution.productExceptSelf(new int[]{1,2,3,4})));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] productExceptSelf(int[] nums) {

            List<Integer> prefixList = new ArrayList<>();

            // 前缀之积
            int pre = 1;
            for (int i = 0; i < nums.length; i++) {
                prefixList.add(pre);
                pre = pre * nums[i];
            }

            // 后缀之积
            List<Integer> suffixList = new ArrayList<>();
            int suf = 1;
            for (int i = nums.length - 1; i >= 0; i--) {
                suffixList.add(suf);
                suf = suf * nums[i];
            }

            // 前缀之积 * 后缀之积
            int[] resultList = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                resultList[i] = (prefixList.get(i) * suffixList.get(nums.length - 1 - i));
            }

            return resultList;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}