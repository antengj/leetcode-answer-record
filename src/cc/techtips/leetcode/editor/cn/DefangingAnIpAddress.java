/**
 * @title 1108. IP 地址无效化
 * @link https://leetcode-cn.com/problems/defanging-an-ip-address/
 * @descirption
 *      给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
 *      所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。
 *
 *      示例 1：
 *      输入：address = "1.1.1.1"
 *      输出："1[.]1[.]1[.]1"
 *
 *      示例 2：
 *      输入：address = "255.100.50.0"
 *      输出："255[.]100[.]50[.]0"
 *
 *      提示：
 *      给出的 address 是一个有效的 IPv4 地址
 * @topic 字符串
 */
package cc.techtips.leetcode.editor.cn;

public class DefangingAnIpAddress {
    public static void main(String[] args) {
        Solution solution = new DefangingAnIpAddress().new Solution();
        System.out.println(solution.defangIPaddr("1.1.1.1"));
        System.out.println(solution.defangIPaddr("255.100.50.0"));
    }

    /**
     * 解题思路:
     *   直接使用replaceAll全局替换
     * 结果:
     *   执行耗时:3 ms,击败了26.36% 的Java用户
     * 	 内存消耗:37.3 MB,击败了13.04% 的Java用户
     */
    class Solution_1 {
        public String defangIPaddr(String address) {
            return address.replaceAll("\\.", "[.]");
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * 解题思路:
     *   遍历String替换'.'为'[.]'
     * 结果:
     *   执行耗时:0 ms,击败了100.00% 的Java用户
     * 	 内存消耗:37.7 MB,击败了13.04% 的Java用户
     */
    class Solution {
        public String defangIPaddr(String address) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < address.length(); i++) {
                if(address.charAt(i) == '.') {
                    sb.append("[.]");
                } else {
                    sb.append(address.charAt(i));
                }
            }
            return sb.toString();
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}