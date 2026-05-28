import java.util.Stack;

public class Largest_Rectangle_in_Histogram {

    public int largestRectangleArea(int[] heights) {

        int maxArea = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= heights.length; i++) {

            int currHeight = (i == heights.length) ? 0 : heights[i];

            while (!stack.isEmpty() && heights[stack.peek()] > currHeight) {

                int height = heights[stack.pop()];

                int width;

                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }

                maxArea = Math.max(maxArea, height * width);
            }

            stack.push(i);
        }

        return maxArea;
    }

    // Main Function
    public static void main(String[] args) {

        Largest_Rectangle_in_Histogram obj = new Largest_Rectangle_in_Histogram();

        int[] heights = { 2, 1, 5, 6, 2, 3 };

        int result = obj.largestRectangleArea(heights);

        System.out.println("Largest Rectangle Area = " + result);
    }
}