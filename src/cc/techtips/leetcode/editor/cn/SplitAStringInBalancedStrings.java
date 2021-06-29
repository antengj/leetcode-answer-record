package cc.techtips.leetcode.editor.cn;

import java.util.Stack;

/**
 * @title 1221. 分割平衡字符串
 * @link https://leetcode-cn.com/problems/split-a-string-in-balanced-strings/
 * @description
 *      在一个「平衡字符串」中，'L' 和 'R' 字符的数量是相同的。
 *      给出一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。
 *      返回可以通过分割得到的平衡字符串的最大数量。
 *
 *      示例 1：
 *      输入：s = "RLRRLLRLRL"
 *      输出：4
 *      解释：s 可以分割为 "RL", "RRLL", "RL", "RL", 每个子字符串中都包含相同数量的 'L' 和 'R'。
 *
 *      示例 2：
 *      输入：s = "RLLLLRRRLR"
 *      输出：3
 *      解释：s 可以分割为 "RL", "LLLRRR", "LR", 每个子字符串中都包含相同数量的 'L' 和 'R'。
 *
 *      示例 3：
 *      输入：s = "LLLLRRRR"
 *      输出：1
 *      解释：s 只能保持原样 "LLLLRRRR".
 *
 *      提示：
 *      1 <= s.length <= 1000
 *      s[i] = 'L' 或 'R'
 *      分割得到的每个字符串都必须是平衡字符串。
 * @tags 贪心算法 字符串
 */
public class SplitAStringInBalancedStrings {
    public static void main(String[] args) {
        Solution solution = new SplitAStringInBalancedStrings().new Solution();
        System.out.println(solution.balancedStringSplit("RLRRLLRLRL"));
        System.out.println(solution.balancedStringSplit("RLLLLRRRLR"));
        System.out.println(solution.balancedStringSplit("LLLLRRRR"));
    }

    /**
     * 解题思路:
     *   遍历每个字符
     *   遇到和栈顶不同的, 就出栈.
     *   遇到和栈顶相同的, 就入栈.
     *   每次循环, 如果栈为空, 就说明分割了一个平衡字符串出来
     * 结果:
     *   执行耗时:3 ms,击败了7.86% 的Java用户
     *   内存消耗:37.1 MB,击败了5.00% 的Java用户
     */
    class Solution_1 {
        public int balancedStringSplit(String s) {
            int count = 0;
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (!stack.isEmpty() && (c == 'L' && stack.peek() == 'R' || c == 'R' && stack.peek() == 'L')) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
                if (stack.isEmpty()) {
                    count++;
                }
            }
            return count;
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * 解题思路:
     *   遍历每个字符
     *   遇到R balance++
     *   遇到L balance--
     *   每次循环, 如果balance==0, 就说明分割了一个平衡字符串出来
     * 结果:
     *   执行耗时:1 ms,击败了74.91% 的Java用户
     *   内存消耗:36.9 MB,击败了5.00% 的Java用户
     */
    class Solution {
        public int balancedStringSplit(String s) {
            int count = 0;
            int balance  = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'R') {
                    balance++;
                } else {
                    balance--;
                }
                if (balance  == 0) count++;
            }
            return count;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}