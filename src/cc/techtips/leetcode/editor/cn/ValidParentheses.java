/**
 * @title 20. 有效的括号
 * @link https://leetcode-cn.com/problems/valid-parentheses/
 * @description
 *      给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *      有效字符串需满足：
 *      左括号必须用相同类型的右括号闭合。
 *      左括号必须以正确的顺序闭合。
 *      注意空字符串可被认为是有效字符串。
 *
 *      示例 1:
 *      输入: "()"
 *      输出: true
 *
 *      示例 2:
 *      输入: "()[]{}"
 *      输出: true
 *
 *      示例 3:
 *      输入: "(]"
 *      输出: false
 *
 *      示例 4:
 *      输入: "([)]"
 *      输出: false
 *    
 *      示例 5:
 *      输入: "{[]}"
 *      输出: true
 * @tags 栈 字符串
 */
package cc.techtips.leetcode.editor.cn;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new ValidParentheses().new Solution();
        System.out.println(solution.isValid("()"));
        System.out.println(solution.isValid("()[]{}"));
        System.out.println(solution.isValid("(]"));
        System.out.println(solution.isValid("([)]"));
        System.out.println(solution.isValid("{[]}"));
        System.out.println(solution.isValid("]"));
        System.out.println(solution.isValid("(])"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * 解题思路:
     *   遇到括号左边压栈, 遇到括号右边, 判断和栈顶元素是否匹配
     *   如果匹配则弹出栈顶元素
     *   当遍历完字符串后, 如果栈为空, 则表示全部匹配
     * 结果:
     *   执行耗时:4 ms,击败了15.44% 的Java用户
     *   内存消耗:37.8 MB,击败了5.48% 的Java用户
     */
    class Solution {
        public boolean isValid(String s) {

            Stack<String> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                String tmp = Character.toString(s.charAt(i));
                if (i == 0) {
                    stack.push(tmp);
                } else {
                    if ("(".equals(tmp) || "[".equals(tmp) || "{".equals(tmp)) {
                        stack.push(tmp);
                    } else if (")".equals(tmp)) {
                        if (!stack.isEmpty() && "(".equals(stack.peek())) {
                            stack.pop();
                        } else {
                            stack.push(tmp);
                        }
                    } else if ("]".equals(tmp)) {
                        if (!stack.isEmpty() && "[".equals(stack.peek())) {
                            stack.pop();
                        } else {
                            stack.push(tmp);
                        }
                    } else if ("}".equals(tmp)) {
                        if (!stack.isEmpty() && "{".equals(stack.peek())) {
                            stack.pop();
                        } else {
                            stack.push(tmp);
                        }
                    }
                }
            }
            return stack.isEmpty();

        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}