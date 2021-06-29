package cc.techtips.leetcode.editor.cn;

import java.util.Arrays;

/**
 * @title 面试题17. 打印从1到最大的n位数
 * @link https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/
 * @description
 *      输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 *
 *      示例 1:
 *      输入: n = 1
 *      输出: [1,2,3,4,5,6,7,8,9]
 *
 *      说明：
 *      用返回一个整数列表来代替打印
 *      n 为正整数
 * @tags 数学
 */
public class DaYinCong1daoZuiDaDeNweiShuLcof {
    public static void main(String[] args) {
        Solution solution = new DaYinCong1daoZuiDaDeNweiShuLcof().new Solution();
        System.out.println(Arrays.toString(solution.printNumbers(1)));
        System.out.println(Arrays.toString(solution.printNumbers(2)));
        System.out.println(Arrays.toString(solution.printNumbers(3)));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * 解题思路:
     *   首先通过n确定最大数是多少
     *   然后遍历最大数, 加入数组
     * 结果:
     *   执行耗时:1 ms,击败了100.00% 的Java用户
     *   内存消耗:47.7 MB,击败了100.00% 的Java用户
     */
    class Solution {
        public int[] printNumbers(int n) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append('9');
            }
            int max = Integer.parseInt(sb.toString());
            int[] rel = new int[max];
            for (int i = 1; i <= max; i++) {
                rel[i - 1] = i;
            }
            return rel;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}