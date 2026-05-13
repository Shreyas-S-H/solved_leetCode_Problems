public class SmallestSubarrayWithSumGreater_X {
    public int sb(int arr[], int k) {
        int n = arr.length;
        int cur_sum = 0;
        int min_len = n + 1;
        int s = 0, e = 0;

        while (e < n) {
            while (cur_sum <= k && e < n) {
                cur_sum += arr[e];
                e++;
            }
            while (cur_sum > k && s < n) {
                if (e - s < min_len)
                    min_len = e - s;

                cur_sum -= arr[s];
                s++;

            }
        }
        return (min_len == n + 1) ? 0 : min_len;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 45, 6, 10, 19 };
        SmallestSubarrayWithSumGreater_X s = new SmallestSubarrayWithSumGreater_X();
        System.out.println(s.sb(arr, 51));
    }
}
