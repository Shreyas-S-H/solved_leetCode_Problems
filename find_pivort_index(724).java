class find_pivort_index {

    public int pivotIndex(int[] nums) {
        int total = 0;

        // Calculate total sum
        for (int num : nums) {
            total += num;
        }

        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int rightSum = total - nums[i] - leftSum;

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }

    // Main method to test
    public static void main(String[] args) {
    	find_pivort_index obj = new find_pivort_index();

        int[] nums = {1, 7, 3, 6, 5, 6};

        int result = obj.pivotIndex(nums);

        System.out.println("Pivot Index: " + result);
    }
}