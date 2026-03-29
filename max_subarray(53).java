class max_subarray {
    public int maxsubarray(int[] nums) {
        int cursum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int val : nums) {
            cursum += val;
            maxsum = Math.max(cursum, maxsum);
            if (cursum < 0) {
                cursum = 0;
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        max_subarray ms = new max_subarray();
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int v = ms.maxsubarray(nums);
        System.out.println("" + v);

    }

}