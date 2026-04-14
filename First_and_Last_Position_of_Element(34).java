
class First_and_Last_Position_of_Element {

    public int[] searchRange(int[] nums, int target) {
        int left = binSearch(nums, target, true);
        int right = binSearch(nums, target, false);
        return new int[] { left, right };
    }

    private int binSearch(int[] nums, int target, boolean leftBias) {
        int l = 0, r = nums.length - 1;
        int i = -1;

        while (l <= r) {
            int m = (l + r) / 2;

            if (target > nums[m]) {
                l = m + 1;
            } else if (target < nums[m]) {
                r = m - 1;
            } else {
                i = m;
                if (leftBias) {
                    r = m - 1; // move left
                } else {
                    l = m + 1; // move right
                }
            }
        }
        return i;
    }

    // Main function for testing
    public static void main(String[] args) {
        First_and_Last_Position_of_Element obj = new First_and_Last_Position_of_Element();
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 8;

        int[] result = obj.searchRange(nums, target);

        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
    }
}