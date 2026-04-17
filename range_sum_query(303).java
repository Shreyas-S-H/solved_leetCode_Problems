class NumArray {

    private int[] prefix;

    public NumArray(int[] nums) {
        prefix = new int[nums.length];

        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return prefix[right];
        }
        return prefix[right] - prefix[left - 1];
    }
}

public class range_sum_query {
    public static void main(String[] args) {

        int[] nums = { 2, 4, 5, 7 };

        NumArray obj = new NumArray(nums);

        System.out.println(obj.sumRange(0, 2)); // Output: 11
        System.out.println(obj.sumRange(1, 3)); // Output: 16
        System.out.println(obj.sumRange(2, 3)); // Output: 12
    }
}