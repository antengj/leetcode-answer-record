package cc.techtips.leetcode.editor.cn;

import java.util.Arrays;

/**
 * @title 1389. 按既定顺序创建目标数组
 * @link https://leetcode-cn.com/problems/create-target-array-in-the-given-order/
 * @description
 *      给你两个整数数组 nums 和 index。你需要按照以下规则创建目标数组：
 *      目标数组 target 最初为空。
 *      按从左到右的顺序依次读取 nums[i] 和 index[i]，在 target 数组中的下标 index[i] 处插入值 nums[i] 。
 *      重复上一步，直到在 nums 和 index 中都没有要读取的元素。
 *      请你返回目标数组。
 *      题目保证数字插入位置总是存在。
 *
 *      示例 1：
 *      输入：nums = [0,1,2,3,4], index = [0,1,2,2,1]
 *      输出：[0,4,1,3,2]
 *      解释：
 *      nums       index     target
 *      0            0        [0]
 *      1            1        [0,1]
 *      2            2        [0,1,2]
 *      3            2        [0,1,3,2]
 *      4            1        [0,4,1,3,2]
 *
 *      示例 2：
 *      输入：nums = [1,2,3,4,0], index = [0,1,2,3,0]
 *      输出：[0,1,2,3,4]
 *      解释：
 *      nums       index     target
 *      1            0        [1]
 *      2            1        [1,2]
 *      3            2        [1,2,3]
 *      4            3        [1,2,3,4]
 *      0            0        [0,1,2,3,4]
 *
 *      示例 3：
 *      输入：nums = [1], index = [0]
 *      输出：[1]
 *
 *      提示：
 *      1 <= nums.length, index.length <= 100
 *      nums.length == index.length
 *      0 <= nums[i] <= 100
 *      0 <= index[i] <= i
 * @tags 数组
 */
public class CreateTargetArrayInTheGivenOrder {
    public static void main(String[] args) {
        Solution solution = new CreateTargetArrayInTheGivenOrder().new Solution();
        System.out.println(Arrays.toString(solution.createTargetArray(new int[]{0,1,2,3,4}, new int[]{0,1,2,2,1})));
        System.out.println(Arrays.toString(solution.createTargetArray(new int[]{1,2,3,4,0}, new int[]{0,1,2,3,0})));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * 解题思路:
     *   因为题目保证数字插入位置总是存在.
     *   所以这题其实可以理解为往动态数组里插入元素
     *   用一个变量size标记当前数组的元素个数
     *   当插入的index == size时, 表示插入数组的末位
     *   否则, 将index后所有的元素后挪一位, 再在index位置插入元素
     * 结果:
     *   执行耗时:0 ms,击败了100.00% 的Java用户
     * 	 内存消耗:38.1 MB,击败了100.00% 的Java用户
     */
    class Solution {
        public int[] createTargetArray(int[] nums, int[] index) {

            int size = 0;
            int[] data = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                if (index[i] != size) {
                    for (int j = size; j > index[i]; j--) {
                        data[j] = data[j - 1];
                    }
                }
                data[index[i]] = nums[i];
                size++;
            }
            return data;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}