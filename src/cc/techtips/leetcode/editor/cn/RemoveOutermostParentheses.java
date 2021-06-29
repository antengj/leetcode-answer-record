package cc.techtips.leetcode.editor.cn;

import java.util.Stack;

/**
 * @title 1021. 删除最外层的括号
 * @link https://leetcode-cn.com/problems/remove-outermost-parentheses/
 * @description
 *      有效括号字符串为空 ("")、"(" + A + ")" 或 A + B，其中 A 和 B 都是有效的括号字符串，+ 代表字符串的连接。
 *      例如，""，"()"，"(())()" 和 "(()(()))" 都是有效的括号字符串。
 *      如果有效字符串 S 非空，且不存在将其拆分为 S = A+B 的方法，我们称其为原语（primitive），其中 A 和 B 都是非空有效括号字符串。
 *      给出一个非空有效字符串 S，考虑将其进行原语化分解，使得：S = P_1 + P_2 + ... + P_k，其中 P_i 是有效括号字符串原语。
 *      对 S 进行原语化分解，删除分解中每个原语字符串的最外层括号，返回 S 。
 *
 *      示例 1：
 *      输入："(()())(())"
 *      输出："()()()"
 *      解释：
 *      输入字符串为 "(()())(())"，原语化分解得到 "(()())" + "(())"，
 *      删除每个部分中的最外层括号后得到 "()()" + "()" = "()()()"。
 *
 *      示例 2：
 *      输入："(()())(())(()(()))"
 *      输出："()()()()(())"
 *      解释：
 *      输入字符串为 "(()())(())(()(()))"，原语化分解得到 "(()())" + "(())" + "(()(()))"，
 *      删除每个部分中的最外层括号后得到 "()()" + "()" + "()(())" = "()()()()(())"。
 *
 *      示例 3：
 *      输入："()()"
 *      输出：""
 *      解释：
 *      输入字符串为 "()()"，原语化分解得到 "()" + "()"，
 *      删除每个部分中的最外层括号后得到 "" + "" = ""。
 *
 *      提示：
 *      S.length <= 10000
 *      S[i] 为 "(" 或 ")"
 *      S 是一个有效括号字符串
 * @tags 栈
 */
public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        Solution solution = new RemoveOutermostParentheses().new Solution();
        System.out.println(solution.removeOuterParentheses("(()())(())"));
        System.out.println(solution.removeOuterParentheses("(()())(())(()(()))"));
        System.out.println(solution.removeOuterParentheses("()()"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * 解题思路:
     *   遇到左括号入栈, 如果此时栈为空, 标记start,
     *   遇到右括号出栈, 如果此时栈为空, 标记end.
     *   然后substring(start+1, end)
     * 结果:
     *   执行耗时:10 ms,击败了37.31% 的Java用户
     * 	 内存消耗:39.4 MB,击败了7.69% 的Java用户
     */
    class Solution {
        public String removeOuterParentheses(String s) {

            Stack<Character> stack = new Stack<>();
            StringBuilder sb = new StringBuilder();
            int start = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    if (stack.isEmpty()) {
                        start = i;
                    }
                    stack.push(s.charAt(i));
                } else {
                    stack.pop();
                    if (stack.isEmpty()) {
                        sb.append(s, start + 1, i);
                    }
                }
            }
            return sb.toString();
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}