public class max_sub_array_circular {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;

        int maxSum = nums[0];
        int currMax = 0;

        int minSum = nums[0];
        int currMin = 0;

        for (int num : nums) {
            totalSum += num;

            // Kadane for max subarray
            currMax = Math.max(num, currMax + num);
            maxSum = Math.max(maxSum, currMax);

            // Kadane for min subarray
            currMin = Math.min(num, currMin + num);
            minSum = Math.min(minSum, currMin);
        }

        // Edge case: if all numbers are negative
        if (maxSum < 0)
            return maxSum;

        // circular case
        return Math.max(maxSum, totalSum - minSum);
    }

    public static void main(String[] args) {
        max_sub_array_circular ms = new max_sub_array_circular();
        int[] nums = { 5, -3, 5 };
        int v = ms.maxSubarraySumCircular(nums);
        System.out.println("" + v);

    }

}
