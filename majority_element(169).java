public class majority_element {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        // Step 1: Find candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify candidate
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return candidate;
        }

        return -1; // No majority element
    }

    public static void main(String[] args) {
        majority_element obj = new majority_element();

        int[] nums = { 3, 2, 3 };

        int result = obj.majorityElement(nums);
        System.out.println("Majority Element: " + result);
    }
}