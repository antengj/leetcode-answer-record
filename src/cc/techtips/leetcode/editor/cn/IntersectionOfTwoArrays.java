/**
 * @title 349. 两个数组的交集
 * @link https://leetcode-cn.com/problems/intersection-of-two-arrays/
 * @description
 *      给定两个数组，编写一个函数来计算它们的交集。
 *
 *      示例 1：
 *      输入：nums1 = [1,2,2,1], nums2 = [2,2]
 *      输出：[2]
 *
 *      示例 2：
 *      输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 *      输出：[9,4]
 *
 *      说明：
 *      输出结果中的每个元素一定是唯一的。
 *      我们可以不考虑输出结果的顺序。
 * @tags 排序 哈希表 双指针 二分查找
 */
package cc.techtips.leetcode.editor.cn;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Solution solution = new IntersectionOfTwoArrays().new Solution();
        System.out.println(Arrays.toString(solution.intersection(new int[]{1,2,2,1}, new int[]{2,2})));
        System.out.println(Arrays.toString(solution.intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * 遍历两个数组, 如果相同, 放入Set
     * 最后的Set就是两个数组相同的数字
     * 将Set转为数组返回
     */
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> set = new HashSet<>();
            for (int value1 : nums1) {
                for (int value2 : nums2) {
                    if (value1 == value2) {
                        set.add(value1);
                    }
                }
            }
            int i = 0;
            int[] result = new int[set.size()];
            for (Integer t : set) {
                result[i++] = t;
            }
            return result;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}