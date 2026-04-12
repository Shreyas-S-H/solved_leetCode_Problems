class search_in_rotated_sorted_array {

    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (target == nums[mid]) {
                return mid;
            }

            // left sorted portion
            if (nums[l] <= nums[mid]) {
                if (target > nums[mid] || target < nums[l]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
            // right sorted portion
            else {
                if (target < nums[mid] || target > nums[r]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }

        return -1;
    }

    // MAIN METHOD
    public static void main(String[] args) {
        search_in_rotated_sorted_array obj = new search_in_rotated_sorted_array();

        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;

        int result = obj.search(nums, target);

        System.out.println("Index of target: " + result);
    }
}