import java.util.HashSet;

public class FindCommonElementsBetweenTwoArrays {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        // Store elements of nums1
        for (int num : nums1) {
            set1.add(num);
        }

        // Store elements of nums2
        for (int num : nums2) {
            set2.add(num);
        }

        int count1 = 0;
        int count2 = 0;

        // Count elements in nums1 present in nums2
        for (int num : nums1) {
            if (set2.contains(num)) {
                count1++;
            }
        }

        // Count elements in nums2 present in nums1
        for (int num : nums2) {
            if (set1.contains(num)) {
                count2++;
            }
        }

        return new int[] { count1, count2 };
    }

    public static void main(String[] args) {
        FindCommonElementsBetweenTwoArrays obj = new FindCommonElementsBetweenTwoArrays();

        int[] nums1 = { 4, 3, 2, 3, 1 };
        int[] nums2 = { 2, 2, 5, 2, 3, 6 };

        int[] result = obj.findIntersectionValues(nums1, nums2);

        System.out.println("Count from nums1 in nums2: " + result[0]);
        System.out.println("Count from nums2 in nums1: " + result[1]);
    }

}
