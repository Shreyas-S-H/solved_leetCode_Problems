public class Sqrt_x {
    public int mySqrt(int x) {
        if (x == 0)
            return 0;

        int low = 1, high = x;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if ((long) mid * mid == x) {
                return mid;
            } else if ((long) mid * mid < x) {
                ans = mid; // store possible answer
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Sqrt_x obj = new Sqrt_x();
        System.out.println(obj.mySqrt(4)); // Output: 2
        System.out.println(obj.mySqrt(8)); // Output: 2
    }
}
