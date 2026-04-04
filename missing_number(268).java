import java.util.Arrays;

class missing_number {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == j) {
                j++;
            } else {
                return j;
            }
        }

        return j; // if missing number is last (n)
    }

    public static void main(String[] args) {
        missing_number obj = new missing_number();
        int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };

        int result = obj.missingNumber(nums);
        System.out.println(" " + result);

    }
}