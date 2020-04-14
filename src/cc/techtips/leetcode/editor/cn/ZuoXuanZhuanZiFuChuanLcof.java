// 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。
// 比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
//
//
// 示例 1： 
//
// 输入: s = "abcdefg", k = 2
// 输出: "cdefgab"
//
// 示例 2： 
//
// 输入: s = "lrloseumgh", k = 6
// 输出: "umghlrlose"
//
// 限制： 1 <= k < s.length <= 10000
// 
// Related Topics 字符串


package cc.techtips.leetcode.editor.cn;

import java.util.LinkedList;
import java.util.Queue;

public class ZuoXuanZhuanZiFuChuanLcof{

    public static void main(String[] args) {
        Solution solution = new ZuoXuanZhuanZiFuChuanLcof().new Solution();
        System.out.println(solution.reverseLeftWords("abcdefg", 2));
        System.out.println(solution.reverseLeftWords("lrloseumgh", 6));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * 解题思路:
     *   用一个队列将字符串每一个字母按顺序放入,
     *   然后取出n个队列头部的字符放入尾部.
     *   最后再将队列中的字符打印出.
     * 结果:
     *   执行耗时:20 ms,击败了5.57% 的Java用户
     *   内存消耗:40.4 MB,击败了100.00% 的Java用户
     */
    class Solution {
        public String reverseLeftWords(String s, int n) {

            Queue<Character> queue = new LinkedList<Character>();

            for (int i = 0; i < s.length(); i++) {
                queue.add(s.charAt(i));
            }
            for (int j = 0; j < n; j++) {
                queue.add(queue.remove());
            }

            StringBuilder sb = new StringBuilder();
            while(!queue.isEmpty()) {
                sb.append(queue.remove());
            }
            return sb.toString();
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}