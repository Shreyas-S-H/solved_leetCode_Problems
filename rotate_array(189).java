
import java.util.Arrays;

class rotate_array {

    public void rotate(int[] nums, int k) {
        int n = nums.length;

        k = k % n; // handle k > n

        reverse(nums, 0, n - 1); // step 1
        reverse(nums, 0, k - 1); // step 2
        reverse(nums, k, n - 1); // step 3
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    // 🔽 MAIN FUNCTION
    public static void main(String[] args) {
        rotate_array obj = new rotate_array();

        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;

        obj.rotate(nums, k);

        System.out.println("Rotated Array: " + Arrays.toString(nums));
    }
}