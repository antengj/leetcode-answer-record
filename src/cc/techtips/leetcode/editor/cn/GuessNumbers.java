package cc.techtips.leetcode.editor.cn;

/**
 * @title LCP 1. 猜数字
 * @link https://leetcode-cn.com/problems/guess-numbers/
 * @description
 *      小A 和 小B 在玩猜数字。小B 每次从 1, 2, 3 中随机选择一个，小A 每次也从 1, 2, 3 中选择一个猜。
 *      他们一共进行三次这个游戏，请返回 小A 猜对了几次？
 *      输入的guess数组为 小A 每次的猜测，answer数组为 小B 每次的选择。guess和answer的长度都等于3。
 *
 *      示例 1：
 *      输入：guess = [1,2,3], answer = [1,2,3]
 *      输出：3
 *      解释：小A 每次都猜对了。
 *
 *      示例 2：
 *      输入：guess = [2,2,3], answer = [3,2,1]
 *      输出：1
 *      解释：小A 只猜对了第二次。
 *
 *      限制：
 *      guess的长度 = 3
 *      answer的长度 = 3
 *      guess的元素取值为 {1, 2, 3} 之一。
 *      answer的元素取值为 {1, 2, 3} 之一。
 * @tags 数组
 */
public class GuessNumbers {
    public static void main(String[] args) {
        Solution solution = new GuessNumbers().new Solution();
        System.out.println(solution.game(new int[]{1,2,3}, new int[]{1,2,3}));
        System.out.println(solution.game(new int[]{2,2,3}, new int[]{3,2,1}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * 解题思路:
     *   因为限定了guess和answer的长度为3,
     *   所以直接循环3次, 然后比较数组中的值是否相等就可以了
     * 结果:
     *   执行耗时:0 ms,击败了100.00% 的Java用户
     *   内存消耗:36.8 MB,击败了5.88% 的Java用户
     */
    class Solution {
        public int game(int[] guess, int[] answer) {
            int j = 0;
            for (int i = 0; i < 3; i++) {
                if (guess[i] == answer[i]) {
                    j++;
                }
            }
            return j;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}