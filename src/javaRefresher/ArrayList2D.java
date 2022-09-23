package javaRefresher;

public class ArrayList2D {
    public static void main(String[] args) {

    }

    /**
     * You are given a N X N square integer matrix A. You have to tell whether A is an identity matrix or not.
     *
     * Identity matrix is a special square matrix whose main diagonal elements are equal to 1 and all other elements are 0.
     */
    public static int q1(final int[][] A) {
        int row = A.length;
        int col = A[0].length;
        for (int i=0; i<row;i++){
            for (int j=0; j<row;j++){
                if((i==j && A[i][j] !=1) || (i!=j && A[i][j] !=0) ){
                    return 0;
                }
            }
        }
        return 1;

    }


    /**
     * You are given a matrix A, you have to return another matrix which is the transpose of A.
     *
     * NOTE: Transpose of a matrix A is defined as - AT[i][j] = A[j][i] ; Where 1 ≤ i ≤ col and 1 ≤ j ≤ row
     */
    public int[][] q2(int[][] A) {
        int row = A.length;
        int col = A[0].length;
        int[][] arr = new int[col][row];

        return arr;
    }

    /**
     * You are given two integer matrices A(having M X N size) and B(having N X P). You have to multiply matrix A with
     * B and return the resultant matrix. (i.e. return the matrix AB).
     */
    public int[][] solve(int[][] A, int[][] B) {
        int row1 = A.length;
        int col1 = A[0].length;

        int row2 = A.length;
        int col2 = A[0].length;
        int[][] arr = new int[row1][col2];

        if (col1 != row2) {
            //array product is not possible
            return arr;
        }

        for (int i=0; i<row1;i++){
            for (int j=0; j<col1;j++){

            }
        }




        return arr;
    }
}
