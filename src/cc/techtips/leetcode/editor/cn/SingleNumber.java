package cc.techtips.leetcode.editor.cn;

import java.util.HashSet;

/**
 * @title 136. 只出现一次的数字
 * @link https://leetcode-cn.com/problems/single-number/
 * @description
 *      给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 *      说明：
 *      你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 *      示例 1:
 *      输入: [2,2,1]
 *      输出: 1
 *
 *      示例 2:
 *      输入: [4,1,2,1,2]
 *      输出: 4
 * @tags 位运算 哈希表
 */
public class SingleNumber {
    public static void main(String[] args) {
        Solution solution = new SingleNumber().new Solution();
        System.out.println(solution.singleNumber(new int[] {2,2,1}));
        System.out.println(solution.singleNumber(new int[] {4,1,2,1,2}));
    }

    class Solution_1 {
        public int singleNumber(int[] nums) {
            HashSet<Integer> hashSet = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                // 如果HashSet包含这个数字则删除
                if (hashSet.contains(nums[i])) {
                    hashSet.remove(nums[i]);
                }
                // 如果HashSet不包含这个数字则加入
                else {
                    hashSet.add(nums[i]);
                }
            }
            // 根据题目给定的规则, 最后HashSet只能包含一个数字, 所以直接返回这个数字
            return hashSet.iterator().next();
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int singleNumber(int[] nums) {
            // a^b^a = a^a^b = 0^b = b, 所以数组中的所有数异或后, 即可找出单独的一个数字
            for (int i = 1; i < nums.length; i++) {
                nums[0] ^= nums[i];
            }
            return nums[0];
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}