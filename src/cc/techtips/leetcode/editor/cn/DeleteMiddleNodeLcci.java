/**
 * @title 面试题 02.03. 删除中间节点
 * @link https://leetcode-cn.com/problems/delete-middle-node-lcci/
 * @description
 *      实现一种算法，删除单向链表中间的某个节点（除了第一个和最后一个节点，不一定是中间节点），假定你只能访问该节点。
 *
 *      示例：
 *      输入：单向链表a->b->c->d->e->f中的节点c
 *      结果：不返回任何数据，但该链表变为a->b->d->e->f
 * @topic 链表
 */
package cc.techtips.leetcode.editor.cn;

public class DeleteMiddleNodeLcci {
    public static void main(String[] args) {
        Solution solution = new DeleteMiddleNodeLcci().new Solution();
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    /**
     * 解题思路:
     *   将node的值修改为nextnode的值,
     *   将node的next修改为nextnode的next,
     *   再将nextnode设为null, gc
     * 结果:
     *   执行耗时:0 ms,击败了100.00% 的Java用户
     *   内存消耗:39.6 MB,击败了100.00% 的Java用户
     */
    class Solution {
        public void deleteNode(ListNode node) {
            ListNode nextNode = node.next;
            node.val = nextNode.val;
            node.next = nextNode.next;
            nextNode = null;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}