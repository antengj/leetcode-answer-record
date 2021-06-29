package cc.techtips.leetcode.editor.cn;

/**
 * @title 1266. 访问所有点的最小时间
 * @link https://leetcode-cn.com/problems/minimum-time-visiting-all-points/
 * @description
 *      平面上有 n 个点，点的位置用整数坐标表示 points[i] = [xi, yi]。请你计算访问所有这些点需要的最小时间（以秒为单位）。
 *      你可以按照下面的规则在平面上移动：
 *      每一秒沿水平或者竖直方向移动一个单位长度，或者跨过对角线（可以看作在一秒内向水平和竖直方向各移动一个单位长度）。
 *      必须按照数组中出现的顺序来访问这些点。
 *
 *      示例 1：
 *      输入：points = [[1,1],[3,4],[-1,0]]
 *      输出：7
 *      解释：一条最佳的访问路径是： [1,1] -> [2,2] -> [3,3] -> [3,4] -> [2,3] -> [1,2] -> [0,1] ->
 *      [-1,0]
 *      从 [1,1] 到 [3,4] 需要 3 秒
 *      从 [3,4] 到 [-1,0] 需要 4 秒
 *      一共需要 7 秒
 *
 *      示例 2：
 *      输入：points = [[3,2],[-2,2]]
 *      输出：5
 *
 *      提示：
 *      points.length == n
 *      1 <= n <= 100
 *      points[i].length == 2
 *      -1000 <= points[i][0], points[i][1] <= 1000
 * @tags 几何, 数组
 */
public class MinimumTimeVisitingAllPoints {
    public static void main(String[] args) {
        Solution solution = new MinimumTimeVisitingAllPoints().new Solution();
        System.out.println(solution.minTimeToVisitAllPoints(new int[][]{{1,1},{3,4},{-1,0}}));
        System.out.println(solution.minTimeToVisitAllPoints(new int[][]{{3,2},{-2,2}}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * 解题思路:
     *   每个点之间的最快移动距离, 可以理解为这两个点之间, x或者y最远的那个步数.
     *   然后将每个点之间最远的步数累加即可.
     * 结果:
     *   执行耗时:1 ms,击败了98.18% 的Java用户
     *   内存消耗:39.6 MB,击败了100.00% 的Java用户
     */
    class Solution {
        public int minTimeToVisitAllPoints(int[][] points) {

            int count = 0;
            for (int i = 1; i < points.length; i++) {
                int xCount = Math.abs(points[i][0] - points[i-1][0]);
                int yCount = Math.abs(points[i][1] - points[i-1][1]);
                count += Math.max(xCount, yCount);
            }
            return count;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}