package cc.techtips.leetcode.editor.cn;

import java.util.HashSet;
import java.util.Set;

/**
 * @title 771. 宝石与石头
 * @link https://leetcode-cn.com/problems/jewels-and-stones/
 * @description
 *      给定字符串 J 代表石头中宝石的类型，和字符串 S 代表你拥有的石头。
 *      S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 *      J 中的字母不重复，J 和 S 中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 *
 *      示例 1:
 *      输入: J = "aA", S = "aAAbbbb"
 *      输出: 3
 *
 *      示例 2:
 *      输入: J = "z", S = "ZZ"
 *      输出: 0
 *
 *      注意:
 *      S 和 J 最多含有50个字母。
 *      J 中的字符不重复。
 * @tags 哈希表
 */
public class JewelsAndStones {
    public static void main(String[] args) {
        Solution solution = new JewelsAndStones().new Solution();
        System.out.println(solution.numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(solution.numJewelsInStones("z", "ZZ"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * 解题思路:
     *   首先将代表宝石类型的J, 转为HashSet
     *   然后遍历自己的宝石S
     *   如果HashSet包含S中的字符, 则count++
     * 结果: (同官方哈希算法, 但是不知道为什么耗时和内存都排名这么低)
     *   执行耗时:3 ms,击败了18.49% 的Java用户
     *   内存消耗:38 MB,击败了9.09% 的Java用户
     */
    class Solution {
        public int numJewelsInStones(String J, String S) {

            int count = 0;
            Set<Character> set = new HashSet<>();
            for(int i = 0; i < J.length(); i++) {
                set.add(J.charAt(i));
            }
            for(int i = 0; i < S.length(); i++) {
                if (set.contains(S.charAt(i))) {
                    count++;
                }
            }
            return count;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}