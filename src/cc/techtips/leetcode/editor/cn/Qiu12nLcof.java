package cc.techtips.leetcode.editor.cn;

/**
 * @title 面试题64. 求1+2+…+n
 * @link https://leetcode-cn.com/problems/qiu-12n-lcof/
 * @description
 *      求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 *
 *      示例 1：
 *      输入: n = 3
 *      输出: 6
 *
 *      示例 2：
 *      输入: n = 9
 *      输出: 45
 *      限制：
 *      1 <= n <= 10000
 * @tags 位运算, 递归
 */
public class Qiu12nLcof {
    public static void main(String[] args) {
        Solution solution = new Qiu12nLcof().new Solution();
        System.out.println(solution.sumNums(3));
        System.out.println(solution.sumNums(9));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int sumNums(int n) {
            // 因为无法使用if, 所以就不能使用递归. 使用&&来终止运算
            boolean flag = (n > 1) && (n += sumNums(n - 1)) > 0;
            return n;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}