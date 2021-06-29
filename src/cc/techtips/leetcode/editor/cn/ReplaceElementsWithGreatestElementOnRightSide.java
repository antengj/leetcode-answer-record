package cc.techtips.leetcode.editor.cn;

import java.util.Arrays;

/**
 * @title 1299. 将每个元素替换为右侧最大元素
 * @link https://leetcode-cn.com/problems/replace-elements-with-greatest-element-on-right-side/
 * @description
 *      给你一个数组 arr ，请你将每个元素用它右边最大的元素替换，如果是最后一个元素，用 -1 替换。
 *      完成所有替换操作后，请你返回这个数组。
 *
 *      示例：
 *      输入：arr = [17,18,5,4,6,1]
 *      输出：[18,6,6,6,1,-1]
 *
 *      提示：
 *      1 <= arr.length <= 10^4
 *      1 <= arr[i] <= 10^5
 * @tags 数组
 */
public class ReplaceElementsWithGreatestElementOnRightSide {
    public static void main(String[] args) {
        Solution solution = new ReplaceElementsWithGreatestElementOnRightSide().new Solution();
        System.out.println(Arrays.toString(solution.replaceElements(new int[]{17,18,5,4,6,1})));
    }

    /**
     * 解题思路:
     *   暴力解题
     * 结果:
     *   执行耗时:268 ms,击败了5.75% 的Java用户
     *   内存消耗:40.5 MB,击败了12.50% 的Java用户
     */
    class Solution_1 {
        public int[] replaceElements(int[] arr) {
            int[] rel = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1) {
                    rel[i] = -1;
                } else {
                    int max = 0;
                    for (int j = i + 1; j < arr.length; j++) {
                        max = Math.max(max, arr[j]);
                    }
                    rel[i] = max;
                }
            }
            return rel;
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * 解题思路:
     *   暴力解题 - 逆序遍历
     *   记录每个点右边的最大值
     * 结果:
     *   执行耗时:2 ms,击败了65.61% 的Java用户
     *   内存消耗:40.8 MB,击败了8.33% 的Java用户
     */
    class Solution {
        public int[] replaceElements(int[] arr) {
            int[] rel = new int[arr.length];
            int rightMax = -1;
            for (int i = arr.length - 1; i >= 0; i--) {
                rel[i] = rightMax;
                rightMax = Math.max(rightMax, arr[i]);
            }
            return rel;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}