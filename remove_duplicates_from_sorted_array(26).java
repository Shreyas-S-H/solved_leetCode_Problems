class remove_duplicates_from_sorted_array {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {
        remove_duplicates_from_sorted_array rd = new remove_duplicates_from_sorted_array();

        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        int k = rd.removeDuplicates(nums);

        System.out.println("Unique count: " + k);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}