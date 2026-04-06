public class container_with_most_water {
    public int maxArea(int[] height) {
        int res = 0;
        int l = 0, r = height.length - 1;

        while (l < r) {
            int area = (r - l) * Math.min(height[l], height[r]);
            res = Math.max(res, area);

            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        container_with_most_water obj = new container_with_most_water();
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println("Max Area: " + obj.maxArea(height));
    }

}
