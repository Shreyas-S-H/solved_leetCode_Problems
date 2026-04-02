import java.util.HashMap;

class subarray_sum_equals_k {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        subarray_sum_equals_k obj = new subarray_sum_equals_k();

        int[] nums = { 1, 1, 1 };
        int k = 2;

        int result = obj.subarraySum(nums, k);
        System.out.println(result);
    }
}