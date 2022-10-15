package dsaBasic;


public class Matrices2D {
    public static void main(String[] args) {
//        System.out.println(q4(Bag.createArray(2, 2)));
//        Bag.printArray(q6TransposeMatrix(Bag.createArray(3, 4)));
        q7(Bag.createArray(2,2));
    }

    /**
     * You are given a 2D integer matrix A, return a 1D integer array containing column-wise sums of original matrix.
     * <p>
     * TC: O(N^2)
     * SC: O(N)
     */
    private static int[] q1(int[][] A) {
        int rowLength = A.length, colLength = A[0].length;
        int[] result = new int[colLength];
        for (int j = 0; j < colLength; j++) {
            int sum = 0;
            for (int i = 0; i < rowLength; i++) {
                sum += A[i][j];
            }
            result[j] = sum;
        }
        return result;
    }

    /**
     * You are given a 2D integer matrix A, return a 1D integer array containing row-wise sums of original matrix.
     * <p>
     * TC: O(N^2)
     * SC: O(N)
     */
    private static int[] q2(int[][] A) {
        int rowLength = A.length, colLength = A[0].length;
        int[] result = new int[rowLength];
        for (int i = 0; i < rowLength; i++) {
            int sum = 0;
            for (int j = 0; j < colLength; j++) {
                sum += A[i][j];
            }
            result[i] = sum;
        }
        return result;
    }

    /**
     * You are given a N X N integer matrix. You have to find the sum of all the main diagonal elements of A.
     * <p>
     * Main diagonal of a matrix A is a collection of elements A[i, j] such that i = j
     * <p>
     * TC: O(N^2)
     * SC: O(N)
     */
    private static int q3(int[][] A) {
        int rowLength = A.length, colLength = A[0].length;
        int sum = 0;
        for (int i = 0; i < rowLength; i++) {

            for (int j = 0; j < colLength; j++) {
                if (i == j) {
                    sum += A[i][j];
                }
            }
        }
        return sum;
    }

    /**
     * You are given a N X N integer matrix. You have to find the sum of all the minor diagonal elements of A.
     * <p>
     * Minor diagonal of a M X M matrix A is a collection of elements A[i, j] such that i + j = M + 1
     * (where i, j are 1-based).
     * <p>
     * TC:
     * SC:
     */
    private static int q4(final int[][] A) {
        int i = 0, j = A.length - 1;
        int sum = 0;
        while (i < A.length && j >= 0) {
            if (i + j == A.length - 1) {
                System.out.println(A[i][j]);
                sum += A[i][j];
            }
            i++;
            j--;
        }
        return sum;
    }

    public static int[][] q6TransposeMatrix(int[][] A) {
        int row = A.length, col = A[0].length;
        int[][] ans = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++)
                ans[i][j] = A[j][i];

        }
        return ans;
    }

    /**
     * TC:
     * SC:
     */
    private static void q7(int[][] A) {
        /*
        rotate array 90 follow 2 steps
        S1: transpose the matrix
        S2: mirror the transpose matrix
        */

        //S1: transpose the matrix
        int[][] transposeMatrix = q6TransposeMatrix(A);

//        System.out.println("Printing transposed Matrix");
//        Bag.printArray(transposeMatrix);

        //S2: mirror the transpose matrix
        for (int i = 0; i < transposeMatrix.length; i++) {
            for (int j = 0; j < transposeMatrix[0].length / 2; j++) {
                int temp = transposeMatrix[i][j];
                int correspondingIndexFromBack = transposeMatrix[0].length - 1 - j;
                transposeMatrix[i][j] = transposeMatrix[i][correspondingIndexFromBack];
                transposeMatrix[i][correspondingIndexFromBack] = temp;
            }

        }

        Bag.printArray(transposeMatrix);
    }
}
