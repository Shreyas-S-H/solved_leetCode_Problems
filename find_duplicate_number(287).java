import java.util.HashSet;

public class find_duplicate_number {

    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }
        return -1;
    }

    public static void main(String[] args) {
        find_duplicate_number obj = new find_duplicate_number();

        int[] nums = { 1, 3, 4, 2, 2 };

        int result = obj.findDuplicate(nums);

        System.out.println("Duplicate number is: " + result);
    }
}