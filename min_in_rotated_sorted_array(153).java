
class min_in_rotated_sorted_array {
    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1; // go right
            } else {
                right = mid; // go left
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = { 3, 4, 5, 1, 2 };

        int result = findMin(nums);
        System.out.println("Minimum element: " + result);
    }
}