import java.util.Random;
public class MatrixOperations {
public static int[][] generateMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
        matrix[i][j] = rand.nextInt(10);
}
}
        return matrix;
}
        public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
        result[i][j] = A[i][j] + B[i][j];
}
}
        return result;
}
        public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
        result[i][j] = A[i][j] - B[i][j];
}
}
        return result;
}
        public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = B[0].length, common = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
        for (int k = 0; k < common; k++) {
        result[i][j] += A[i][k] * B[k][j];
}
}
}
        return result;
}
        public static int[][] transposeMatrix(int[][] A) {
        int rows = A.length, cols = A[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
        transpose[j][i] = A[i][j];
}
}
        return transpose;
}
        public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
}
        public static int determinant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
             - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
             + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
}
        public static double[][] inverse2x2(int[][] matrix) {
        int det = determinant2x2(matrix);
        if (det == 0) return null;
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) det;
        inverse[0][1] = -matrix[0][1] / (double) det;
        inverse[1][0] = -matrix[1][0] / (double) det;
        inverse[1][1] = matrix[0][0] / (double) det;
        return inverse;
}
        public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
        for (int val : row) {
        System.out.print(val + "\t");
}
        System.out.println();
}
}
        public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
        for (double val : row) {
        System.out.printf("%.2f\t", val);
}
        System.out.println();
}
}
        public static void main(String[] args) {
        int[][] A = generateMatrix(3, 3);
        int[][] B = generateMatrix(3, 3);
        System.out.println("Matrix A:");
        displayMatrix(A);
        System.out.println("Matrix B:");
        displayMatrix(B);
        System.out.println("Sum of A and B:");
        displayMatrix(addMatrices(A, B));
        System.out.println("Difference of A and B:");
        displayMatrix(subtractMatrices(A, B));
        System.out.println("Product of A and B:");
        displayMatrix(multiplyMatrices(A, B));
        System.out.println("Transpose of A:");
        displayMatrix(transposeMatrix(A));
        System.out.println("Determinant of A:");
        System.out.println(determinant3x3(A));
        System.out.println("Inverse of a 2x2 Matrix (if A is 2x2):");
        if (A.length == 2 && A[0].length == 2) {
        double[][] inverse = inverse2x2(A);
        if (inverse != null) displayMatrix(inverse);
        else System.out.println("Matrix is not invertible.");
}
}
}
