import java.util.Arrays;

class sort_colors {

    public void sortColors(int[] nums) {
        int l = 0, m = 0, h = nums.length - 1;

        while (m <= h) {
            if (nums[m] == 0) {
                int t = nums[l];
                nums[l] = nums[m];
                nums[m] = t;
                l++;
                m++;
            } else if (nums[m] == 1) {
                m++;
            } else { // nums[m] == 2
                int t = nums[m];
                nums[m] = nums[h];
                nums[h] = t;
                h--;
            }
        }
    }

    public static void main(String[] args) {
        sort_colors obj = new sort_colors();

        int[] arr = { 2, 0, 2, 1, 1, 0 };

        System.out.println("Before: " + Arrays.toString(arr));

        obj.sortColors(arr);

        System.out.println("After:  " + Arrays.toString(arr));
    }
}