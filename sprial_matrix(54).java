import java.util.*;

class sprial_matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        if (matrix == null || matrix.length == 0)
            return res;

        int left = 0, right = matrix[0].length;
        int top = 0, bottom = matrix.length;

        while (left < right && top < bottom) {

            // top row
            for (int i = left; i < right; i++) {
                res.add(matrix[top][i]);
            }
            top++;

            // right column
            for (int i = top; i < bottom; i++) {
                res.add(matrix[i][right - 1]);
            }
            right--;

            if (!(left < right && top < bottom))
                break;

            // bottom row
            for (int i = right - 1; i >= left; i--) {
                res.add(matrix[bottom - 1][i]);
            }
            bottom--;

            // left column
            for (int i = bottom - 1; i >= top; i--) {
                res.add(matrix[i][left]);
            }
            left++;
        }

        return res;
    }

    // Main method for testing
    public static void main(String[] args) {
        sprial_matrix obj = new sprial_matrix();

        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        List<Integer> result = obj.spiralOrder(matrix);
        System.out.println(result);
    }
}