public class split_array_largest_sum {

    public static void main(String[] args) {

        int[] nums = { 7, 2, 5, 10, 8 };
        int m = 2;

        Solution obj = new Solution();
        int result = obj.splitArray(nums, m);

        System.out.println("Minimum largest subarray sum: " + result);
    }
}

class Solution {

    public int splitArray(int[] nums, int m) {

        int left = 0, right = 0;

        // Step 1: find range
        for (int n : nums) {
            left = Math.max(left, n);
            right += n;
        }

        int res = right;

        // Step 2: binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canSplit(nums, m, mid)) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return res;
    }

    private boolean canSplit(int[] nums, int m, int largest) {
        int subarray = 0;
        int curSum = 0;

        for (int n : nums) {
            curSum += n;

            if (curSum > largest) {
                subarray++;
                curSum = n;
            }
        }

        return subarray + 1 <= m;
    }
}