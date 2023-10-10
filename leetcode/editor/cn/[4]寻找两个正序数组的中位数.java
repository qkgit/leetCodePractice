package editor.cn;

//给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。 
//
// 算法的时间复杂度应该为 O(log (m+n)) 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums1 = [1,3], nums2 = [2]
//输出：2.00000
//解释：合并数组 = [1,2,3] ，中位数 2
// 
//
// 示例 2： 
//
// 
//输入：nums1 = [1,2], nums2 = [3,4]
//输出：2.50000
//解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
// 
//
// 
//
// 
//
// 提示： 
//
// 
// nums1.length == m 
// nums2.length == n 
// 0 <= m <= 1000 
// 0 <= n <= 1000 
// 1 <= m + n <= 2000 
// -10⁶ <= nums1[i], nums2[i] <= 10⁶ 
// 
//
// Related Topics 数组 二分查找 分治 👍 6816 👎 0

class MedianOfTwoSortedArrays{

    public static void main(String[] args) {
        Solution solution = new MedianOfTwoSortedArrays().new Solution();
        int[] num1 = {1, 2, 3, 4};  // 2.5
        int[] num2 = {2, 3, 4, 5}; // 3.5
        int[] ints = {1, 2,2,3, 3, 4,4, 7};
        double median = solution.getMedian(ints);
        System.out.println(median);
        double num = solution.findMedianSortedArrays(num1, num2);
        System.out.println(num);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = getMedian(nums1);
        double median1 = getMedian(nums2);
        if (median == 0) return median1;
        if (median1 == 0) return median;
        return (median + median1)/2;
    }

        /**
         *
         * @param arr
         * @return
         */
    public double getMedian(int[] arr){
        int length = arr.length;
        if (length == 0){
            return 0;
        }
        double median;
        if (length % 2 == 0){
            // 偶数
            median = (double)(arr[length/2]+arr[length/2 - 1])/2;
        }else {
            // 奇数
            median = arr[length/2];
        }
        return median;
    }



}
//leetcode submit region end(Prohibit modification and deletion)


}