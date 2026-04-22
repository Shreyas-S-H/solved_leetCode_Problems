import java.util.*;

class sort_array_heap {

    public int[] sortArray(int[] nums) {
        int n = nums.length;

        // Step 1: Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(nums, n, i);
        }

        // Step 2: Extract elements from heap
        for (int i = n - 1; i > 0; i--) {
            swap(nums, 0, i);
            heapify(nums, i, 0);
        }

        return nums;
    }

    private void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // ✅ MAIN METHOD
    public static void main(String[] args) {
        sort_array_heap obj = new sort_array_heap();

        int[] nums = { 5, 3, 8, 4, 1, 2 };

        System.out.println("Original array:");
        System.out.println(Arrays.toString(nums));

        obj.sortArray(nums);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(nums));
    }
}