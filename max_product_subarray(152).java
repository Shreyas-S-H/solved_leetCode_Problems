class max_product_subarray {
    public int maxproduct(int[] nums) {
        int maxprod = nums[0];
        int minprod = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int cur = nums[i];

            if (cur < 0) {
                int temp = maxprod;
                maxprod = minprod;
                minprod = temp;

            }
            maxprod = Math.max(cur, maxprod * cur);
            minprod = Math.min(cur, minprod * cur);
            result = Math.max(maxprod, result);

        }
        return result;

    }

    public static void main(String[] args) {
        max_product_subarray mps = new max_product_subarray();
        int[] nums = { 2, 3, -2, 4 };
        int v = mps.maxproduct(nums);
        System.out.println(" " + v);

    }

}
