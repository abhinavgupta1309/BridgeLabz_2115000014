public class Search2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;
        int left = 0, right = rows * cols - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midElement = matrix[mid / cols][mid % cols];
            if (midElement == target) return true;
            if (midElement < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5}, {7, 10, 11}, {12, 16, 20}};
        System.out.println("Target Found: " + searchMatrix(matrix, 10));
    }
}
