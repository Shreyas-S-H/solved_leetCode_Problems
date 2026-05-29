public class Search_a_2D_Matrix {

    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix.length == 0) {
            return false;
        }

        int n = matrix.length;
        int m = matrix[0].length;

        int lo = 0;
        int hi = (n * m) - 1;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            if (matrix[mid / m][mid % m] == target) {
                return true;
            }

            if (matrix[mid / m][mid % m] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return false;
    }

    // Main Method
    public static void main(String[] args) {

        Search_a_2D_Matrix obj = new Search_a_2D_Matrix();

        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        int target = 3;

        System.out.println(obj.searchMatrix(matrix, target));
    }
}