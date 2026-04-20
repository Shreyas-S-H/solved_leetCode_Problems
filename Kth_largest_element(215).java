import java.util.Random;

class Kth_largest_element {
    Random rand = new Random();

    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        return quickSelect(nums, 0, n - 1, n - k);
    }

    private int quickSelect(int[] nums, int left, int right, int k) {
        if (left == right)
            return nums[left];

        int pivotIndex = left + rand.nextInt(right - left + 1);
        int pivot = nums[pivotIndex];

        int low = left, mid = left, high = right;

        while (mid <= high) {
            if (nums[mid] < pivot) {
                swap(nums, low++, mid++);
            } else if (nums[mid] > pivot) {
                swap(nums, mid, high--);
            } else {
                mid++;
            }
        }

        if (k < low) {
            return quickSelect(nums, left, low - 1, k);
        } else if (k > high) {
            return quickSelect(nums, high + 1, right, k);
        } else {
            return pivot;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // ✅ MAIN METHOD
    public static void main(String[] args) {
        Kth_largest_element sol = new Kth_largest_element();

        int[] nums = { 1, 2, 3, 4, 5, 1, 1, 1, 1, 1 };
        int k = 2;

        int result = sol.findKthLargest(nums, k);
        System.out.println("Kth Largest Element: " + result);
    }
}