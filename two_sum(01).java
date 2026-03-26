import java.util.*;

class two_sum {
    public int[] twosum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int first = arr[i];
            int sec = target - first;
            if (map.containsKey(sec)) {
                return new int[] { i, map.get(sec) };

            }
            map.put(first, i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        two_sum obj = new two_sum();

        int[] arr = { 2, 11, 15, 7 };
        int target = 9;

        int[] result = obj.twosum(arr, target);

        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found");
        }
    }
}